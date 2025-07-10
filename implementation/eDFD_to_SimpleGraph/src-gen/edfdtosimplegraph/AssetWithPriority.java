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
import org.secdfd.model.Priority;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         generic relations between an Asset and the information in its Value list 
 *         
 *         pattern assetWithPriority(a : Asset, pr : Priority) {
 *             Asset.value.Priority(a, pr);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated("org.eclipse.xtext.xbase.compiler.JvmModelGenerator")
public final class AssetWithPriority extends BaseGeneratedEMFQuerySpecification<AssetWithPriority.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.assetWithPriority pattern,
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

    private Priority fPr;

    private static List<String> parameterNames = makeImmutableList("a", "pr");

    private Match(final Asset pA, final Priority pPr) {
      this.fA = pA;
      this.fPr = pPr;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "a": return this.fA;
          case "pr": return this.fPr;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fA;
          case 1: return this.fPr;
          default: return null;
      }
    }

    public Asset getA() {
      return this.fA;
    }

    public Priority getPr() {
      return this.fPr;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("a".equals(parameterName) ) {
          this.fA = (Asset) newValue;
          return true;
      }
      if ("pr".equals(parameterName) ) {
          this.fPr = (Priority) newValue;
          return true;
      }
      return false;
    }

    public void setA(final Asset pA) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fA = pA;
    }

    public void setPr(final Priority pPr) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fPr = pPr;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.assetWithPriority";
    }

    @Override
    public List<String> parameterNames() {
      return AssetWithPriority.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fA, fPr};
    }

    @Override
    public AssetWithPriority.Match toImmutable() {
      return isMutable() ? newMatch(fA, fPr) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"a\"=" + prettyPrintValue(fA) + ", ");
      result.append("\"pr\"=" + prettyPrintValue(fPr));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fA, fPr);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof AssetWithPriority.Match)) {
          AssetWithPriority.Match other = (AssetWithPriority.Match) obj;
          return Objects.equals(fA, other.fA) && Objects.equals(fPr, other.fPr);
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
    public AssetWithPriority specification() {
      return AssetWithPriority.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static AssetWithPriority.Match newEmptyMatch() {
      return new Mutable(null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static AssetWithPriority.Match newMutableMatch(final Asset pA, final Priority pPr) {
      return new Mutable(pA, pPr);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static AssetWithPriority.Match newMatch(final Asset pA, final Priority pPr) {
      return new Immutable(pA, pPr);
    }

    private static final class Mutable extends AssetWithPriority.Match {
      Mutable(final Asset pA, final Priority pPr) {
        super(pA, pPr);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends AssetWithPriority.Match {
      Immutable(final Asset pA, final Priority pPr) {
        super(pA, pPr);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.assetWithPriority pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * generic relations between an Asset and the information in its Value list 
   * 
   * pattern assetWithPriority(a : Asset, pr : Priority) {
   *     Asset.value.Priority(a, pr);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see AssetWithPriority
   * 
   */
  public static class Matcher extends BaseMatcher<AssetWithPriority.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static AssetWithPriority.Matcher on(final ViatraQueryEngine engine) {
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
    public static AssetWithPriority.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_A = 0;

    private static final int POSITION_PR = 1;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(AssetWithPriority.Matcher.class);

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
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<AssetWithPriority.Match> getAllMatches(final Asset pA, final Priority pPr) {
      return rawStreamAllMatches(new Object[]{pA, pPr}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<AssetWithPriority.Match> streamAllMatches(final Asset pA, final Priority pPr) {
      return rawStreamAllMatches(new Object[]{pA, pPr});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<AssetWithPriority.Match> getOneArbitraryMatch(final Asset pA, final Priority pPr) {
      return rawGetOneArbitraryMatch(new Object[]{pA, pPr});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final Asset pA, final Priority pPr) {
      return rawHasMatch(new Object[]{pA, pPr});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final Asset pA, final Priority pPr) {
      return rawCountMatches(new Object[]{pA, pPr});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final Asset pA, final Priority pPr, final Consumer<? super AssetWithPriority.Match> processor) {
      rawForEachMatch(new Object[]{pA, pPr}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final Asset pA, final Priority pPr, final Consumer<? super AssetWithPriority.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pA, pPr}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pA the fixed value of pattern parameter a, or null if not bound.
     * @param pPr the fixed value of pattern parameter pr, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public AssetWithPriority.Match newMatch(final Asset pA, final Priority pPr) {
      return AssetWithPriority.Match.newMatch(pA, pPr);
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
    public Stream<Asset> streamAllValuesOfa(final AssetWithPriority.Match partialMatch) {
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
    public Stream<Asset> streamAllValuesOfa(final Priority pPr) {
      return rawStreamAllValuesOfa(new Object[]{null, pPr});
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final AssetWithPriority.Match partialMatch) {
      return rawStreamAllValuesOfa(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for a.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Asset> getAllValuesOfa(final Priority pPr) {
      return rawStreamAllValuesOfa(new Object[]{null, pPr}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Priority> rawStreamAllValuesOfpr(final Object[] parameters) {
      return rawStreamAllValues(POSITION_PR, parameters).map(Priority.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Priority> getAllValuesOfpr() {
      return rawStreamAllValuesOfpr(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Priority> streamAllValuesOfpr() {
      return rawStreamAllValuesOfpr(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Priority> streamAllValuesOfpr(final AssetWithPriority.Match partialMatch) {
      return rawStreamAllValuesOfpr(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Priority> streamAllValuesOfpr(final Asset pA) {
      return rawStreamAllValuesOfpr(new Object[]{pA, null});
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Priority> getAllValuesOfpr(final AssetWithPriority.Match partialMatch) {
      return rawStreamAllValuesOfpr(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for pr.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Priority> getAllValuesOfpr(final Asset pA) {
      return rawStreamAllValuesOfpr(new Object[]{pA, null}).collect(Collectors.toSet());
    }

    @Override
    protected AssetWithPriority.Match tupleToMatch(final Tuple t) {
      try {
          return AssetWithPriority.Match.newMatch((Asset) t.get(POSITION_A), (Priority) t.get(POSITION_PR));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssetWithPriority.Match arrayToMatch(final Object[] match) {
      try {
          return AssetWithPriority.Match.newMatch((Asset) match[POSITION_A], (Priority) match[POSITION_PR]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected AssetWithPriority.Match arrayToMatchMutable(final Object[] match) {
      try {
          return AssetWithPriority.Match.newMutableMatch((Asset) match[POSITION_A], (Priority) match[POSITION_PR]);
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
    public static IQuerySpecification<AssetWithPriority.Matcher> querySpecification() {
      return AssetWithPriority.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.assetWithPriority pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<AssetWithPriority.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pA the value of pattern parameter a in the currently processed match
     * @param pPr the value of pattern parameter pr in the currently processed match
     * 
     */
    public abstract void accept(final Asset pA, final Priority pPr);

    @Override
    public void accept(final AssetWithPriority.Match match) {
      accept(match.getA(), match.getPr());
    }
  }

  private AssetWithPriority() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static AssetWithPriority instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected AssetWithPriority.Matcher instantiate(final ViatraQueryEngine engine) {
    return AssetWithPriority.Matcher.on(engine);
  }

  @Override
  public AssetWithPriority.Matcher instantiate() {
    return AssetWithPriority.Matcher.create();
  }

  @Override
  public AssetWithPriority.Match newEmptyMatch() {
    return AssetWithPriority.Match.newEmptyMatch();
  }

  @Override
  public AssetWithPriority.Match newMatch(final Object... parameters) {
    return AssetWithPriority.Match.newMatch((Asset) parameters[0], (Priority) parameters[1]);
  }

  /**
   * Inner class allowing the singleton instance of {@link AssetWithPriority} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link AssetWithPriority#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final AssetWithPriority INSTANCE = new AssetWithPriority();

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
    private static final AssetWithPriority.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_a = new PParameter("a", "org.secdfd.model.Asset", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Asset")), PParameterDirection.INOUT);

    private final PParameter parameter_pr = new PParameter("pr", "org.secdfd.model.Priority", new EDataTypeInSlotsKey((EDataType)getClassifierLiteralSafe("http://www.secdfd.org/secdfd", "Priority")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_a, parameter_pr);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.assetWithPriority";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("a","pr");
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
          PVariable var_pr = body.getOrCreateVariableByName("pr");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_pr), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.secdfd.org/secdfd", "Priority")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_a, parameter_a),
             new ExportedParameter(body, var_pr, parameter_pr)
          ));
          //     Asset.value.Priority(a, pr)
          new TypeConstraint(body, Tuples.flatTupleOf(var_a), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Asset")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_a, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Asset", "value")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.secdfd.org/secdfd", "Value")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.secdfd.org/secdfd", "Value", "Priority")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EDataTypeInSlotsKey((EDataType)getClassifierLiteral("http://www.secdfd.org/secdfd", "Priority")));
          new Equality(body, var__virtual_1_, var_pr);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
