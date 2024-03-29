package orm;

import org.jooq.DSLContext;
import org.jooq.Function3;

import java.util.List;
import java.util.function.BiFunction;

public final class ModelLoader<K, M extends Model> extends LazyLoader<K, M> {

  // *******************************************************************************************************************
  // Construction & Initialization
  // *******************************************************************************************************************
  ModelLoader(final PersistenceContext persistenceContext,
              final BiFunction<DSLContext, K, M> fetcher,
              final Function3<DSLContext, K, M, List<Action>> actionsCreator
  ) {
    super(persistenceContext, fetcher, actionsCreator);
  }

  ModelLoader(final PersistenceContext persistenceContext,
              final K key,
              final BiFunction<DSLContext, K, M> fetcher,
              final Function3<DSLContext, K, M, List<Action>> actionsCreator) {
    super(persistenceContext, key, fetcher, actionsCreator);
  }

}
