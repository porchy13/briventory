package orm.models;

import org.jooq.DSLContext;
import org.jooq.UpdatableRecord;

/**
 * The {@code PersistableModel3} should be used for models that needs five {@link UpdatableRecord} to be persisted into
 * the database. Each time a {@link UpdatableRecord} has been persisted, as it has been refreshed with the autogenerated
 * * fields, it is provided back to the model to refresh those particular fields.
 *
 * @param <R1> the first precise subtype of {@link UpdatableRecord}.
 * @param <R2> the second precise subtype of {@link UpdatableRecord}.
 * @param <R3> the third precise subtype of {@link UpdatableRecord}.
 * @param <R4> the fourth precise subtype of {@link UpdatableRecord}.
 * @param <R5> the fifth precise subtype of {@link UpdatableRecord}.
 */
public interface PersistableModel5<R1 extends UpdatableRecord<R1>,
                                      R2 extends UpdatableRecord<R2>,
                                      R3 extends UpdatableRecord<R3>,
                                      R4 extends UpdatableRecord<R4>,
                                      R5 extends UpdatableRecord<R5>> extends PersistableModel4<R1, R2, R3, R4> {

  /**
   * Creates the instance of {@link R4}, matching this model.
   *
   * @param dslContext the {@link DSLContext}.
   *
   * @return the {@link org.jooq.Record}.
   */
  R5 createRecord5(DSLContext dslContext);

  /**
   * Refreshes the model with the updated {@link R5}.
   *
   * @param r5 the {@link R5}, that has been refreshed from the database with autogenerated fields.
   */
  void refresh5(R5 r5);

}