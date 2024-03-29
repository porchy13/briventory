package controllers.accounts;

import controllers.ErrorsController;
import controllers.auth.SessionHelper;
import controllers.auth.SignedInAuthenticator;
import me.gosimple.nbvcxz.Nbvcxz;
import me.gosimple.nbvcxz.resources.ConfigurationBuilder;
import me.gosimple.nbvcxz.resources.Dictionary;
import me.gosimple.nbvcxz.resources.DictionaryBuilder;
import models.Account;
import models.BrickLinkTokens;
import models.BrickSetTokens;
import models.RebrickableTokens;
import play.data.Form;
import play.data.FormFactory;
import play.i18n.MessagesApi;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import play.mvc.Security;
import play.routing.JavaScriptReverseRouter;
import repositories.AccountsRepository;
import views.html.accounts.*;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static play.mvc.Http.MimeTypes.JAVASCRIPT;

/** The {@code AccountsController} handle all entry points that are specific to {@link Account} instances. */
@Security.Authenticated(SignedInAuthenticator.class)
public final class AccountsController extends Controller {

  // *******************************************************************************************************************
  // Injected Attributes
  // *******************************************************************************************************************

  /** The injected {@link MessagesApi} instance. */
  private final MessagesApi messagesApi;
  /** The injected {@link SessionHelper} instance. */
  private final SessionHelper sessionHelper;
  /** The injected {@link ErrorsController} instance. */
  private final ErrorsController errorsController;
  /** The injected {@link FormFactory} instance. */
  private final FormFactory formFactory;
  /** The injected {@link AccountsRepository} instance. */
  private final AccountsRepository accountsRepository;

  // *******************************************************************************************************************
  // Injected Templates
  // *******************************************************************************************************************

  /** The {@link settings } template. */
  private final settings settings;

  /** The {@link activity } template. */
  private final activity activity;

  // *******************************************************************************************************************
  // Construction & Initialization
  // *******************************************************************************************************************

  /**
   * Creates a new instance of {@link AccountsController} by injecting the necessary parameters.
   *
   * @param messagesApi the {@link MessagesApi} instance.
   * @param sessionHelper the {@link SessionHelper} instance.
   * @param errorsController the {@link ErrorsController} instance.
   * @param formFactory the {@link FormFactory} instance.
   * @param accountsRepository the {@link AccountsRepository} instance.
   * @param settings the {@link settings} template.
   * @param activity the {@link activity} template.
   */
  @Inject
  public AccountsController(final MessagesApi messagesApi,
                            final SessionHelper sessionHelper,
                            final ErrorsController errorsController,
                            final FormFactory formFactory,
                            final AccountsRepository accountsRepository,
                            final settings settings,
                            final activity activity) {
    this.messagesApi = messagesApi;
    this.sessionHelper = sessionHelper;
    this.errorsController = errorsController;
    this.formFactory = formFactory;
    this.accountsRepository = accountsRepository;
    this.settings = settings;
    this.activity = activity;
  }

  // *******************************************************************************************************************
  // Password Matters
  // *******************************************************************************************************************
  public static Nbvcxz nbvcxz(final String... wordsToExclude) {

    // From https://github.com/GoSimpleLLC/nbvcxz#requires-java
    // Create a map of excluded words on a per-user basis using a hypothetical "User" object that contains this info
    final List<Dictionary> dictionaryList = ConfigurationBuilder.getDefaultDictionaries();
    dictionaryList.add(new DictionaryBuilder().setDictionaryName("exclude")
                                              .addWords(Arrays.asList(wordsToExclude), 0)
                                              .setExclusion(true)
                                              .createDictionary());

    // Create our configuration object and set our custom minimum entropy, and custom dictionary list
    final var minimumEntry = 40d;
    var configuration = new ConfigurationBuilder()
        .setMinimumEntropy(minimumEntry)
        .setDictionaries(dictionaryList)
        .createConfiguration();

    return new Nbvcxz(configuration);
  }

  // *******************************************************************************************************************
  // Entry Points related to the activities page
  // *******************************************************************************************************************

  /**
   * Returns the <em>activity</em> page.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the {@link activity} page.
   */
  public Result activity(final Http.Request request) {
    final Optional<Account> accountOptional = sessionHelper.retrieveAccount(request);
    if (accountOptional.isPresent()) {
      final var preferred = messagesApi.preferred(request);
      return ok(activity.render(accountOptional.get(), preferred));
    }
    return errorsController.forbidden(request);
  }

  // *******************************************************************************************************************
  // Entry Points related to the settings page
  // *******************************************************************************************************************

  /**
   * Provides the JavaScript routes in a JS object called {@code settingsJSRoutes}.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the {@code settingsJSRoutes} JS object.
   */
  public Result settingsJs(final Http.Request request) {
    return ok(JavaScriptReverseRouter.create("settingsJSRoutes", "jQuery.ajax", request.host(),
                                             routes.javascript.AccountsController.updateName(),
                                             routes.javascript.AccountsController.updateEmail(),
                                             routes.javascript.AccountsController.updateCredentials(),
                                             routes.javascript.AccountsController.updateBrickLinkTokens(),
                                             routes.javascript.AccountsController.deleteBrickLinkTokens(),
                                             routes.javascript.AccountsController.updateBrickSetTokens(),
                                             routes.javascript.AccountsController.deleteBrickSetTokens(),
                                             routes.javascript.AccountsController.updateRebrickableTokens(),
                                             routes.javascript.AccountsController.deleteRebrickableTokens()))
        .as(JAVASCRIPT);
  }

  /**
   * Returns the <em>settings</em> page.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the {@link settings} page.
   */
  public Result settings(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    if (optionalAccount.isPresent()) {
      final var preferred = messagesApi.preferred(request);

      final Form<EmailForm> emailForm = formFactory.form(EmailForm.class)
                                                   .fill(new EmailForm(optionalAccount.get().getId(),
                                                                       optionalAccount.get().getEmail()));

      final Form<NameForm> nameForm = formFactory.form(NameForm.class)
                                                 .fill(new NameForm(optionalAccount.get().getFirstname(),
                                                                    optionalAccount.get().getLastname()));

      final Form<CredentialsForm> credentialsForm =
          formFactory.form(CredentialsForm.class)
                     .fill(new CredentialsForm(optionalAccount.get().getId()));

      final Form<BrickLinkTokensForm> brickLinkTokensForm =
          formFactory.form(BrickLinkTokensForm.class)
                     .fill(new BrickLinkTokensForm(optionalAccount.get().getBrickLinkTokens()));

      final Form<BrickSetTokensForm> brickSetTokensForm =
          formFactory.form(BrickSetTokensForm.class)
                     .fill(new BrickSetTokensForm(optionalAccount.get().getBrickSetTokens()));

      final Form<RebrickableTokensForm> rebrickableTokensForm =
          formFactory.form(RebrickableTokensForm.class)
                     .fill(new RebrickableTokensForm(optionalAccount.get().getRebrickableTokens()));

      return ok(settings.render(optionalAccount.get(),
                                emailForm,
                                nameForm,
                                credentialsForm,
                                brickLinkTokensForm,
                                brickSetTokensForm,
                                rebrickableTokensForm,
                                request,
                                preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the e-mail address and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateEmail(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    if (optionalAccount.isPresent()) {
      final var preferred = messagesApi.preferred(request);
      final Form<EmailForm> emailForm = formFactory.form(EmailForm.class)
                                                   .bindFromRequest(request);

      final Account account = optionalAccount.get();
      if (!emailForm.hasErrors() && account.getId().equals(emailForm.get().getIdAccount())) {
        account.setEmail(emailForm.get().getEmail());
        accountsRepository.persist(account);
        return ok(emailCard.render(emailForm, request, preferred));
      }
      return badRequest(emailCard.render(emailForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the first name and the last name and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateName(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    if (optionalAccount.isPresent()) {
      final var preferred = messagesApi.preferred(request);
      final Form<NameForm> nameForm = formFactory.form(NameForm.class)
                                                 .bindFromRequest(request);

      if (!nameForm.hasErrors()) {
        final Account account = optionalAccount.get();
        account.setFirstname(nameForm.get().getFirstname());
        account.setLastname(nameForm.get().getLastname());
        accountsRepository.persist(account);
        return ok(nameCard.render(nameForm, request, preferred));
      }
      return badRequest(nameCard.render(nameForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the credentials and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateCredentials(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    if (optionalAccount.isPresent()) {
      final var preferred = messagesApi.preferred(request);
      final Form<CredentialsForm> credentialsForm = formFactory.form(CredentialsForm.class)
                                                               .bindFromRequest(request);

      final Account account = optionalAccount.get();
      if (!credentialsForm.hasErrors() && account.getId().equals(credentialsForm.get().getIdAccount())) {
        account.setClearPassword(credentialsForm.get().getNewPassword());
        accountsRepository.persist(account);
        return ok(credentialsCard.render(credentialsForm, request, preferred));
      }
      return badRequest(credentialsCard.render(credentialsForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the BrickLink tokens and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateBrickLinkTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Form<BrickLinkTokensForm> brickLinkTokensForm = formFactory.form(BrickLinkTokensForm.class)
                                                                       .bindFromRequest(request);

      final Account account = optionalAccount.get();
      if (!brickLinkTokensForm.hasErrors()) {
        final BrickLinkTokensForm form = brickLinkTokensForm.get();
        account.setBrickLinkTokens(new BrickLinkTokens(account,
                                                       form.getConsumerKey(),
                                                       form.getConsumerSecret(),
                                                       form.getTokenValue(),
                                                       form.getTokenSecret()));
        accountsRepository.persist(account);
        brickLinkTokensForm.get().setAsFilled();
        return ok(brickLinkTokensCard.render(brickLinkTokensForm, request, preferred));
      }
      return badRequest(brickLinkTokensCard.render(brickLinkTokensForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * Deletes the {@link BrickLinkTokens} for the current account.
   *
   * @param request the {@link Http.Request}.
   *
   * @return an empty form, if the deletion succeeds.
   */
  public Result deleteBrickLinkTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Account account = optionalAccount.get();
      account.clearBrickLinkTokens();
      accountsRepository.persist(account);
      return ok(brickLinkTokensCard.render(formFactory.form(BrickLinkTokensForm.class),
                                           request,
                                           preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the BrickSet tokens and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateBrickSetTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Form<BrickSetTokensForm> brickSetTokensForm = formFactory.form(BrickSetTokensForm.class)
                                                                     .bindFromRequest(request);

      final Account account = optionalAccount.get();
      if (!brickSetTokensForm.hasErrors()) {
        final BrickSetTokensForm form = brickSetTokensForm.get();
        account.setBrickSetTokens(new BrickSetTokens(account,
                                                     form.getApiKey(),
                                                     form.getUsername(),
                                                     form.getPassword()));
        accountsRepository.persist(account);
        brickSetTokensForm.get().setAsFilled();
        return ok(brickSetTokensCard.render(brickSetTokensForm, request, preferred));
      }
      return badRequest(brickSetTokensCard.render(brickSetTokensForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * Deletes the {@link BrickSetTokens} for the current account.
   *
   * @param request the {@link Http.Request}.
   *
   * @return an empty form, if the deletion succeeds.
   */
  public Result deleteBrickSetTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Account account = optionalAccount.get();
      account.clearBrickSetTokens();
      accountsRepository.persist(account);
      return ok(brickSetTokensCard.render(formFactory.form(BrickSetTokensForm.class),
                                          request,
                                          preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * update the Rebrickable tokens and returns the related form.
   *
   * @param request the {@link Http.Request}.
   *
   * @return the related form with the new values or the errors.
   */
  public Result updateRebrickableTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Form<RebrickableTokensForm> rebrickableTokensForm = formFactory.form(RebrickableTokensForm.class)
                                                                           .bindFromRequest(request);

      final Account account = optionalAccount.get();
      if (!rebrickableTokensForm.hasErrors()) {
        final RebrickableTokensForm form = rebrickableTokensForm.get();
        account.setRebrickableTokens(new RebrickableTokens(account,
                                                           form.getKey()));
        accountsRepository.persist(account);
        rebrickableTokensForm.get().setAsFilled();
        return ok(rebrickableTokensCard.render(rebrickableTokensForm, request, preferred));
      }
      return badRequest(rebrickableTokensCard.render(rebrickableTokensForm, request, preferred));
    }
    return errorsController.forbidden(request);
  }

  /**
   * Deletes the {@link RebrickableTokens} for the current account.
   *
   * @param request the {@link Http.Request}.
   *
   * @return an empty form, if the deletion succeeds.
   */
  public Result deleteRebrickableTokens(final Http.Request request) {
    final Optional<Account> optionalAccount = sessionHelper.retrieveAccount(request);
    final var preferred = messagesApi.preferred(request);

    if (optionalAccount.isPresent()) {
      final Account account = optionalAccount.get();
      account.clearRebrickableTokens();
      accountsRepository.persist(account);
      return ok(rebrickableTokensCard.render(formFactory.form(RebrickableTokensForm.class),
                                             request,
                                             preferred));
    }
    return errorsController.forbidden(request);
  }

}
