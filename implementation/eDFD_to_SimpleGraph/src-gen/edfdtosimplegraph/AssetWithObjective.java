/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Generated;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
import org.eclipse.viatra.query.runtime.emf.types.EDataTypeInSlotsKey;
import org.eclipse.viatra.query.runtime.emf.types.EStructuralFeatureInstancesKey;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.matchers.psystem.PBody;
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.basicenumerables.TypeConstraint;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PParameterDirection;
import org.eclipse.viatra.query.runtime.matchers.psystem.queries.PVisibility;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.secdfd.model.Asset;
import org.secdfd.model.Objective;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern assetWithObjective(a : Asset, obj : Objective) {
 *             Asset.value.Objective(a, obj);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated("org.eclipse.xtext.xbase.compiler.JvmModelGenerator")
public final class AssetWithObjective extends BaseGeneratedEMFQuerySpecification<AssetWithObjective.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.assetWithObjective pattern,
   * to be used in conjunction with {@link Matcher}.
   * 
   * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
   * Each instance is a (possibly partial) substitution of pattern parameters,
   * usable to represent a match of the pattern in the result of a query,
   * or to specify the bound (fixed) input parameters when issuing a query.
   * 
   * @see Matcher
   *  @see Processor
   * 
   */
  public static abstract class Match extends BasePatternMatch {
    private Asset fA;

    private Objective fObj;

    private static List<String> parameterNames = makeImmutableList("a", "obj");

    private Match(final Asset pA, final Objective pObj) {
      this.fA = pA;
      this.fObj = pObj;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "a": return this.fA;
          case "obj": return this.fObj;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fA;
          case 1: return this.fObj;
          default: return null;
      }
    }

    public Asset getA() {
      return this.fA;
    }

    public Objective getObj() {
      return this.fObj;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      if ("obj".equals(parameterName) ) {
          this.fObj = (Objective) newValue;
          return true;
      }
      return false;
    }

    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }

    public void setObj(final Objective pObj) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fObj = pObj;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.assetWithObjective";
    }

    @Override
    public List<String> parameterNames() {
      return AssetWithObjective.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fA, fObj};
    }

    @Override
    public AssetWithObjective.Match toImmutable() {
      return isMutable() ? newMatch(fA, fObj) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
      result.append("\"obj\"=" + prettyPrintValue(fObj));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fA, fObj);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AssetWithObjective.Match)) {
          AssetWithObjective.Match other = (AssetWithObjective.Match) obj;
          return Objects.equals(fA, other.fA) && Objects.equals(fObj, other.fObj);
      } else {
          // this should be infrequent
          if (!(obj instanceof IPatternMatch)) {
              return false;
          }
          IPatternMatch otherSig  = (IPatternMatch) obj;
          return Objects.equals(specification(), otherSig.specification()) && Arrays.deepEquals(toArray(), otherSig.toArray());
      }
    }

    @Override
    public AssetWithObjective specification() {
      return AssetWithObjective.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AssetWithObjective.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AssetWithObjective.Match newMutableMatch(final Asset pA, final Objective pObj) {
      return new Mutable(pA, pObj);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AssetWithObjective.Match newMatch(final Asset pA, final Objective pObj) {
      return new Immutable(pA, pObj);
    }

    private static final class Mutable extends AssetWithObjective.Match {
      Mutable(final Asset pA, final Objective pObj) {
        super(pA, pObj);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends AssetWithObjective.Match {
      Immutable(final Asset pA, final Objective pObj) {
        super(pA, pObj);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.assetWithObjective pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern assetWithObjective(a : Asset, obj : Objective) {
   *     Asset.value.Objective(a, obj);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AssetWithObjective
   * 
   */
  public static class Matcher extends BaseMatcher<AssetWithObjective.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AssetWithObjective.Matcher on(final ViatraQueryEngine engine) {
      // check if matcher already exists
      Matcher matcher = engine.getExistingMatcher(querySpecification());
      if (matcher == null) {
          matcher = (Matcher)engine.getMatcher(querySpecification());
      }
      return matcher;
    }

    /**
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * @return an initialized matcher
     * @noreference This method is for internal matcher initialization by the framework, do not call it manually.
     * 
     */
    public static AssetWithObjective.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_A = 0;

    private static final int POSITION_OBJ = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AssetWithObjective.Matcher.class);

    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    private Matcher() {
      super(querySpecification());
    }

    /**
     * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AssetWithObjective.Match> getAllMatches(final Asset pA, final Objective pObj) {
      return rawStreamAllMatches(new Object[]{pA, pObj}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AssetWithObjective.Match> streamAllMatches(final Asset pA, final Objective pObj) {
      return rawStreamAllMatches(new Object[]{pA, pObj});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AssetWithObjective.Match> getOneArbitraryMatch(final Asset pA, final Objective pObj) {
      return rawGetOneArbitraryMatch(new Object[]{pA, pObj});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Asset pA, final Objective pObj) {
      return rawHasMatch(new Object[]{pA, pObj});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Asset pA, final Objective pObj) {
      return rawCountMatches(new Object[]{pA, pObj});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Asset pA, final Objective pObj, final Consumer<? super AssetWithObjective.Match> processor) {
      rawForEachMatch(new Object[]{pA, pObj}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Asset pA, final Objective pObj, final Consumer<? super AssetWithObjective.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA, pObj}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pObj the fixed value of pattern parameter obj, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AssetWithObjective.Match newMatch(final Asset pA, final Objective pObj) {
      return AssetWithObjective.Match.newMatch(pA, pObj);
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Asset> rawStreamAllValuesOfa(final Object[] parameters) {
      return rawStreamAllValues(POSITION_A, parameters).map(Asset.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa() {
      return rawStreamAllValuesOfa(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final AssetWithObjective.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Asset> streamAllValuesOfa(final Objective pObj) {
      return rawStreamAllValuesOfa(new Object[]{null, pObj});
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final AssetWithObjective.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final Objective pObj) {
      return rawStreamAllValuesOfa(new Object[]{null, pObj}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Objective> rawStreamAllValuesOfobj(final Object[] parameters) {
      return rawStreamAllValues(POSITION_OBJ, parameters).map(Objective.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Objective> getAllValuesOfobj() {
      return rawStreamAllValuesOfobj(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Objective> streamAllValuesOfobj() {
      return rawStreamAllValuesOfobj(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Objective> streamAllValuesOfobj(final AssetWithObjective.Match partialMatch) {
      return rawStreamAllValuesOfobj(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Objective> streamAllValuesOfobj(final Asset pA) {
      return rawStreamAllValuesOfobj(new Object[]{pA, null});
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Objective> getAllValuesOfobj(final AssetWithObjective.Match partialMatch) {
      return rawStreamAllValuesOfobj(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for obj.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Objective> getAllValuesOfobj(final Asset pA) {
      return rawStreamAllValuesOfobj(new Object[]{pA, null}).collect(Collectors.toSet());
    }

    @Override
    protected AssetWithObjective.Match tupleToMatch(final Tuple t) {
      try {
          return AssetWithObjective.Match.newMatch((Asset) t.get(POSITION_A), (Objective) t.get(POSITION_OBJ));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssetWithObjective.Match arrayToMatch(final Object[] match) {
      try {
          return AssetWithObjective.Match.newMatch((Asset) match[POSITION_A], (Objective) match[POSITION_OBJ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssetWithObjective.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AssetWithObjective.Match.newMutableMatch((Asset) match[POSITION_A], (Objective) match[POSITION_OBJ]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    /**
     * @return the singleton instance of the query specification of this pattern
     * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
     * 
     */
    public static IQuerySpecification<AssetWithObjective.Matcher> querySpecification() {
      return AssetWithObjective.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.assetWithObjective pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<AssetWithObjective.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pA the value of pattern parameter a in the currently processed match
     * @param pObj the value of pattern parameter obj in the currently processed match
     * 
     */
    public abstract void accept(final Asset pA, final Objective pObj);

    @Override
    public void accept(final AssetWithObjective.Match match) {
      accept(match.getA(), match.getObj());
    }
  }

  private AssetWithObjective() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AssetWithObjective instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected AssetWithObjective.Matcher instantiate(final ViatraQueryEngine engine) {
    return AssetWithObjective.Matcher.on(engine);
  }

  @Override
  public AssetWithObjective.Matcher instantiate() {
    return AssetWithObjective.Matcher.create();
  }

  @Override
  public AssetWithObjective.Match newEmptyMatch() {
    return AssetWithObjective.Match.newEmptyMatch();
  }

  @Override
  public AssetWithObjective.Match newMatch(final Object... parameters) {
    return AssetWithObjective.Match.newMatch((Asset) parameters[0], (Objective) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link AssetWithObjective} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AssetWithObjective#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AssetWithObjective INSTANCE = new AssetWithObjective();

    /**
     * Statically initializes the query specification <b>after</b> the field {@link #INSTANCE} is assigned.
     * This initialization order is required to support indirect recursion.
     * 
     * <p> The static initializer is defined using a helper field to work around limitations of the code generator.
     * 
     */
    private static final Object STATIC_INITIALIZER = ensureInitialized();

    public static Object ensureInitialized() {
      INSTANCE.ensureInitializedInternal();
      return null;
    }
  }

  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private static final AssetWithObjective.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_a = new PParameter("a", "org.secdfd.model.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Asset")), PParameterDirection.INOUT);

    private final PParameter parameter_obj = new PParameter("obj", "org.secdfd.model.Objective", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Objective")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_obj);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.assetWithObjective";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","obj");
    }

    @Override
    public List<PParameter> getParameters() {
      return parameters;
    }

    @Override
    public Set<PBody> doGetContainedBodies() {
      setEvaluationHints(new QueryEvaluationHint(null, QueryEvaluationHint.BackendRequirement.UNSPECIFIED));
      Set<PBody> bodies = new LinkedHashSet<>();
      {
          PBody body = new PBody(this);
          PVariable var_a = body.getOrCreateVariableByName("a");
          PVariable var_obj = body.getOrCreateVariableByName("obj");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_obj), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.secdfd.org/secdfd", "Objective")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_obj, parameter_obj)
          ));
          //     Asset.value.Objective(a, obj)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Asset", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Value")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Value", "Objective")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.secdfd.org/secdfd", "Objective")));
          new Equality(body, var__virtual_1_, var_obj);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
