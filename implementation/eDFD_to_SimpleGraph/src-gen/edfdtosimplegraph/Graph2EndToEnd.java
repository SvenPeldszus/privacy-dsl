/**
 * Generated from platform:/resource/eDFD_to_SimpleGraph/src/edfdtosimplegraph/eDFDXformM2M.vql
 */
package edfdtosimplegraph;

import graph.Identifiable;
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
import org.eclipse.viatra.query.runtime.api.IPatternMatch;
import org.eclipse.viatra.query.runtime.api.IQuerySpecification;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.api.impl.BaseMatcher;
import org.eclipse.viatra.query.runtime.api.impl.BasePatternMatch;
import org.eclipse.viatra.query.runtime.emf.types.EClassTransitiveInstancesKey;
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
import traceability.EDFDToGraph;
import traceability.GraphEndToEndTrace;

/**
 * A pattern-specific query specification that can instantiate Matcher in a type-safe way.
 * 
 * <p>Original source:
 *         <code><pre>
 *         pattern Graph2EndToEnd(
 *         	graph2endtoend : EDFDToGraph,
 *             trace : GraphEndToEndTrace,
 *             graphElements : Identifiable,
 *             endtoendElements : Identifiable
 *         ){
 *         	EDFDToGraph.graphEndToEndTrace(graph2endtoend, trace);
 *         	GraphEndToEndTrace.graphElements(trace, graphElements);
 *         	GraphEndToEndTrace.endtoendGraphElements(trace, endtoendElements);
 *         }
 * </pre></code>
 * 
 * @see Matcher
 * @see Match
 * 
 */
@SuppressWarnings("all")
@Generated("org.eclipse.xtext.xbase.compiler.JvmModelGenerator")
public final class Graph2EndToEnd extends BaseGeneratedEMFQuerySpecification<Graph2EndToEnd.Matcher> {
  /**
   * Pattern-specific match representation of the edfdtosimplegraph.Graph2EndToEnd pattern,
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
    private EDFDToGraph fGraph2endtoend;

    private GraphEndToEndTrace fTrace;

    private Identifiable fGraphElements;

    private Identifiable fEndtoendElements;

    private static List<String> parameterNames = makeImmutableList("graph2endtoend", "trace", "graphElements", "endtoendElements");

    private Match(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      this.fGraph2endtoend = pGraph2endtoend;
      this.fTrace = pTrace;
      this.fGraphElements = pGraphElements;
      this.fEndtoendElements = pEndtoendElements;
    }

    @Override
    public Object get(final String parameterName) {
      switch(parameterName) {
          case "graph2endtoend": return this.fGraph2endtoend;
          case "trace": return this.fTrace;
          case "graphElements": return this.fGraphElements;
          case "endtoendElements": return this.fEndtoendElements;
          default: return null;
      }
    }

    @Override
    public Object get(final int index) {
      switch(index) {
          case 0: return this.fGraph2endtoend;
          case 1: return this.fTrace;
          case 2: return this.fGraphElements;
          case 3: return this.fEndtoendElements;
          default: return null;
      }
    }

    public EDFDToGraph getGraph2endtoend() {
      return this.fGraph2endtoend;
    }

    public GraphEndToEndTrace getTrace() {
      return this.fTrace;
    }

    public Identifiable getGraphElements() {
      return this.fGraphElements;
    }

    public Identifiable getEndtoendElements() {
      return this.fEndtoendElements;
    }

    @Override
    public boolean set(final String parameterName, final Object newValue) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      if ("graph2endtoend".equals(parameterName) ) {
          this.fGraph2endtoend = (EDFDToGraph) newValue;
          return true;
      }
      if ("trace".equals(parameterName) ) {
          this.fTrace = (GraphEndToEndTrace) newValue;
          return true;
      }
      if ("graphElements".equals(parameterName) ) {
          this.fGraphElements = (Identifiable) newValue;
          return true;
      }
      if ("endtoendElements".equals(parameterName) ) {
          this.fEndtoendElements = (Identifiable) newValue;
          return true;
      }
      return false;
    }

    public void setGraph2endtoend(final EDFDToGraph pGraph2endtoend) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGraph2endtoend = pGraph2endtoend;
    }

    public void setTrace(final GraphEndToEndTrace pTrace) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fTrace = pTrace;
    }

    public void setGraphElements(final Identifiable pGraphElements) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fGraphElements = pGraphElements;
    }

    public void setEndtoendElements(final Identifiable pEndtoendElements) {
      if (!isMutable()) throw new java.lang.UnsupportedOperationException();
      this.fEndtoendElements = pEndtoendElements;
    }

    @Override
    public String patternName() {
      return "edfdtosimplegraph.Graph2EndToEnd";
    }

    @Override
    public List<String> parameterNames() {
      return Graph2EndToEnd.Match.parameterNames;
    }

    @Override
    public Object[] toArray() {
      return new Object[]{fGraph2endtoend, fTrace, fGraphElements, fEndtoendElements};
    }

    @Override
    public Graph2EndToEnd.Match toImmutable() {
      return isMutable() ? newMatch(fGraph2endtoend, fTrace, fGraphElements, fEndtoendElements) : this;
    }

    @Override
    public String prettyPrint() {
      StringBuilder result = new StringBuilder();
      result.append("\"graph2endtoend\"=" + prettyPrintValue(fGraph2endtoend) + ", ");
      result.append("\"trace\"=" + prettyPrintValue(fTrace) + ", ");
      result.append("\"graphElements\"=" + prettyPrintValue(fGraphElements) + ", ");
      result.append("\"endtoendElements\"=" + prettyPrintValue(fEndtoendElements));
      return result.toString();
    }

    @Override
    public int hashCode() {
      return Objects.hash(fGraph2endtoend, fTrace, fGraphElements, fEndtoendElements);
    }

    @Override
    public boolean equals(final Object obj) {
      if (this == obj)
          return true;
      if (obj == null) {
          return false;
      }
      if ((obj instanceof Graph2EndToEnd.Match)) {
          Graph2EndToEnd.Match other = (Graph2EndToEnd.Match) obj;
          return Objects.equals(fGraph2endtoend, other.fGraph2endtoend) && Objects.equals(fTrace, other.fTrace) && Objects.equals(fGraphElements, other.fGraphElements) && Objects.equals(fEndtoendElements, other.fEndtoendElements);
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
    public Graph2EndToEnd specification() {
      return Graph2EndToEnd.instance();
    }

    /**
     * Returns an empty, mutable match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @return the empty match.
     * 
     */
    public static Graph2EndToEnd.Match newEmptyMatch() {
      return new Mutable(null, null, null, null);
    }

    /**
     * Returns a mutable (partial) match.
     * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
     * 
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return the new, mutable (partial) match object.
     * 
     */
    public static Graph2EndToEnd.Match newMutableMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return new Mutable(pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public static Graph2EndToEnd.Match newMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return new Immutable(pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements);
    }

    private static final class Mutable extends Graph2EndToEnd.Match {
      Mutable(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
        super(pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements);
      }

      @Override
      public boolean isMutable() {
        return true;
      }
    }

    private static final class Immutable extends Graph2EndToEnd.Match {
      Immutable(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
        super(pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements);
      }

      @Override
      public boolean isMutable() {
        return false;
      }
    }
  }

  /**
   * Generated pattern matcher API of the edfdtosimplegraph.Graph2EndToEnd pattern,
   * providing pattern-specific query methods.
   * 
   * <p>Use the pattern matcher on a given model via {@link #on(ViatraQueryEngine)},
   * e.g. in conjunction with {@link ViatraQueryEngine#on(QueryScope)}.
   * 
   * <p>Matches of the pattern will be represented as {@link Match}.
   * 
   * <p>Original source:
   * <code><pre>
   * pattern Graph2EndToEnd(
   * 	graph2endtoend : EDFDToGraph,
   *     trace : GraphEndToEndTrace,
   *     graphElements : Identifiable,
   *     endtoendElements : Identifiable
   * ){
   * 	EDFDToGraph.graphEndToEndTrace(graph2endtoend, trace);
   * 	GraphEndToEndTrace.graphElements(trace, graphElements);
   * 	GraphEndToEndTrace.endtoendGraphElements(trace, endtoendElements);
   * }
   * </pre></code>
   * 
   * @see Match
   *  @see Processor
   * @see Graph2EndToEnd
   * 
   */
  public static class Matcher extends BaseMatcher<Graph2EndToEnd.Match> {
    /**
     * Initializes the pattern matcher within an existing VIATRA Query engine.
     * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
     * 
     * @param engine the existing VIATRA Query engine in which this matcher will be created.
     * @throws ViatraQueryRuntimeException if an error occurs during pattern matcher creation
     * 
     */
    public static Graph2EndToEnd.Matcher on(final ViatraQueryEngine engine) {
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
    public static Graph2EndToEnd.Matcher create() {
      return new Matcher();
    }

    private static final int POSITION_GRAPH2ENDTOEND = 0;

    private static final int POSITION_TRACE = 1;

    private static final int POSITION_GRAPHELEMENTS = 2;

    private static final int POSITION_ENDTOENDELEMENTS = 3;

    private static final Logger LOGGER = ViatraQueryLoggingUtil.getLogger(Graph2EndToEnd.Matcher.class);

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
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return matches represented as a Match object.
     * 
     */
    public Collection<Graph2EndToEnd.Match> getAllMatches(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllMatches(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements}).collect(Collectors.toSet());
    }

    /**
     * Returns a stream of all matches of the pattern that conform to the given fixed values of some parameters.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return a stream of matches represented as a Match object.
     * 
     */
    public Stream<Graph2EndToEnd.Match> streamAllMatches(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllMatches(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements});
    }

    /**
     * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return a match represented as a Match object, or null if no match is found.
     * 
     */
    public Optional<Graph2EndToEnd.Match> getOneArbitraryMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawGetOneArbitraryMatch(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements});
    }

    /**
     * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
     * under any possible substitution of the unspecified parameters (if any).
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return true if the input is a valid (partial) match of the pattern.
     * 
     */
    public boolean hasMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawHasMatch(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements});
    }

    /**
     * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return the number of pattern matches found.
     * 
     */
    public int countMatches(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawCountMatches(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements});
    }

    /**
     * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @param processor the action that will process each pattern match.
     * 
     */
    public void forEachMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements, final Consumer<? super Graph2EndToEnd.Match> processor) {
      rawForEachMatch(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements}, processor);
    }

    /**
     * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
     * Neither determinism nor randomness of selection is guaranteed.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @param processor the action that will process the selected match.
     * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
     * 
     */
    public boolean forOneArbitraryMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements, final Consumer<? super Graph2EndToEnd.Match> processor) {
      return rawForOneArbitraryMatch(new Object[]{pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements}, processor);
    }

    /**
     * Returns a new (partial) match.
     * This can be used e.g. to call the matcher with a partial match.
     * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
     * @param pGraph2endtoend the fixed value of pattern parameter graph2endtoend, or null if not bound.
     * @param pTrace the fixed value of pattern parameter trace, or null if not bound.
     * @param pGraphElements the fixed value of pattern parameter graphElements, or null if not bound.
     * @param pEndtoendElements the fixed value of pattern parameter endtoendElements, or null if not bound.
     * @return the (partial) match object.
     * 
     */
    public Graph2EndToEnd.Match newMatch(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return Graph2EndToEnd.Match.newMatch(pGraph2endtoend, pTrace, pGraphElements, pEndtoendElements);
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<EDFDToGraph> rawStreamAllValuesOfgraph2endtoend(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GRAPH2ENDTOEND, parameters).map(EDFDToGraph.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfgraph2endtoend() {
      return rawStreamAllValuesOfgraph2endtoend(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfgraph2endtoend() {
      return rawStreamAllValuesOfgraph2endtoend(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfgraph2endtoend(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfgraph2endtoend(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<EDFDToGraph> streamAllValuesOfgraph2endtoend(final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOfgraph2endtoend(new Object[]{null, pTrace, pGraphElements, pEndtoendElements});
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfgraph2endtoend(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfgraph2endtoend(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graph2endtoend.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<EDFDToGraph> getAllValuesOfgraph2endtoend(final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOfgraph2endtoend(new Object[]{null, pTrace, pGraphElements, pEndtoendElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<GraphEndToEndTrace> rawStreamAllValuesOftrace(final Object[] parameters) {
      return rawStreamAllValues(POSITION_TRACE, parameters).map(GraphEndToEndTrace.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GraphEndToEndTrace> getAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<GraphEndToEndTrace> streamAllValuesOftrace() {
      return rawStreamAllValuesOftrace(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<GraphEndToEndTrace> streamAllValuesOftrace(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<GraphEndToEndTrace> streamAllValuesOftrace(final EDFDToGraph pGraph2endtoend, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOftrace(new Object[]{pGraph2endtoend, null, pGraphElements, pEndtoendElements});
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GraphEndToEndTrace> getAllValuesOftrace(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOftrace(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for trace.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<GraphEndToEndTrace> getAllValuesOftrace(final EDFDToGraph pGraph2endtoend, final Identifiable pGraphElements, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOftrace(new Object[]{pGraph2endtoend, null, pGraphElements, pEndtoendElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Identifiable> rawStreamAllValuesOfgraphElements(final Object[] parameters) {
      return rawStreamAllValues(POSITION_GRAPHELEMENTS, parameters).map(Identifiable.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements() {
      return rawStreamAllValuesOfgraphElements(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements() {
      return rawStreamAllValuesOfgraphElements(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfgraphElements(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfgraphElements(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOfgraphElements(new Object[]{pGraph2endtoend, pTrace, null, pEndtoendElements});
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfgraphElements(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for graphElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfgraphElements(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pEndtoendElements) {
      return rawStreamAllValuesOfgraphElements(new Object[]{pGraph2endtoend, pTrace, null, pEndtoendElements}).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    protected Stream<Identifiable> rawStreamAllValuesOfendtoendElements(final Object[] parameters) {
      return rawStreamAllValues(POSITION_ENDTOENDELEMENTS, parameters).map(Identifiable.class::cast);
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfendtoendElements() {
      return rawStreamAllValuesOfendtoendElements(emptyArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfendtoendElements() {
      return rawStreamAllValuesOfendtoendElements(emptyArray());
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfendtoendElements(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfendtoendElements(partialMatch.toArray());
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * </p>
     * <strong>NOTE</strong>: It is important not to modify the source model while the stream is being processed.
     * If the match set of the pattern changes during processing, the contents of the stream is <strong>undefined</strong>.
     * In such cases, either rely on {@link #getAllMatches()} or collect the results of the stream in end-user code.
     *      
     * @return the Stream of all values or empty set if there are no matches
     * 
     */
    public Stream<Identifiable> streamAllValuesOfendtoendElements(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfendtoendElements(new Object[]{pGraph2endtoend, pTrace, pGraphElements, null});
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfendtoendElements(final Graph2EndToEnd.Match partialMatch) {
      return rawStreamAllValuesOfendtoendElements(partialMatch.toArray()).collect(Collectors.toSet());
    }

    /**
     * Retrieve the set of values that occur in matches for endtoendElements.
     * @return the Set of all values or empty set if there are no matches
     * 
     */
    public Set<Identifiable> getAllValuesOfendtoendElements(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements) {
      return rawStreamAllValuesOfendtoendElements(new Object[]{pGraph2endtoend, pTrace, pGraphElements, null}).collect(Collectors.toSet());
    }

    @Override
    protected Graph2EndToEnd.Match tupleToMatch(final Tuple t) {
      try {
          return Graph2EndToEnd.Match.newMatch((EDFDToGraph) t.get(POSITION_GRAPH2ENDTOEND), (GraphEndToEndTrace) t.get(POSITION_TRACE), (Identifiable) t.get(POSITION_GRAPHELEMENTS), (Identifiable) t.get(POSITION_ENDTOENDELEMENTS));
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in tuple not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Graph2EndToEnd.Match arrayToMatch(final Object[] match) {
      try {
          return Graph2EndToEnd.Match.newMatch((EDFDToGraph) match[POSITION_GRAPH2ENDTOEND], (GraphEndToEndTrace) match[POSITION_TRACE], (Identifiable) match[POSITION_GRAPHELEMENTS], (Identifiable) match[POSITION_ENDTOENDELEMENTS]);
      } catch(ClassCastException e) {
          LOGGER.error("Element(s) in array not properly typed!",e);
          return null;
      }
    }

    @Override
    protected Graph2EndToEnd.Match arrayToMatchMutable(final Object[] match) {
      try {
          return Graph2EndToEnd.Match.newMutableMatch((EDFDToGraph) match[POSITION_GRAPH2ENDTOEND], (GraphEndToEndTrace) match[POSITION_TRACE], (Identifiable) match[POSITION_GRAPHELEMENTS], (Identifiable) match[POSITION_ENDTOENDELEMENTS]);
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
    public static IQuerySpecification<Graph2EndToEnd.Matcher> querySpecification() {
      return Graph2EndToEnd.instance();
    }
  }

  /**
   * A match processor tailored for the edfdtosimplegraph.Graph2EndToEnd pattern.
   * 
   * Clients should derive an (anonymous) class that implements the abstract process().
   * 
   */
  public static abstract class Processor implements Consumer<Graph2EndToEnd.Match> {
    /**
     * Defines the action that is to be executed on each match.
     * @param pGraph2endtoend the value of pattern parameter graph2endtoend in the currently processed match
     * @param pTrace the value of pattern parameter trace in the currently processed match
     * @param pGraphElements the value of pattern parameter graphElements in the currently processed match
     * @param pEndtoendElements the value of pattern parameter endtoendElements in the currently processed match
     * 
     */
    public abstract void accept(final EDFDToGraph pGraph2endtoend, final GraphEndToEndTrace pTrace, final Identifiable pGraphElements, final Identifiable pEndtoendElements);

    @Override
    public void accept(final Graph2EndToEnd.Match match) {
      accept(match.getGraph2endtoend(), match.getTrace(), match.getGraphElements(), match.getEndtoendElements());
    }
  }

  private Graph2EndToEnd() {
    super(GeneratedPQuery.INSTANCE);
  }

  /**
   * @return the singleton instance of the query specification
   * @throws ViatraQueryRuntimeException if the pattern definition could not be loaded
   * 
   */
  public static Graph2EndToEnd instance() {
    try{
        return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
        throw processInitializerError(err);
    }
  }

  @Override
  protected Graph2EndToEnd.Matcher instantiate(final ViatraQueryEngine engine) {
    return Graph2EndToEnd.Matcher.on(engine);
  }

  @Override
  public Graph2EndToEnd.Matcher instantiate() {
    return Graph2EndToEnd.Matcher.create();
  }

  @Override
  public Graph2EndToEnd.Match newEmptyMatch() {
    return Graph2EndToEnd.Match.newEmptyMatch();
  }

  @Override
  public Graph2EndToEnd.Match newMatch(final Object... parameters) {
    return Graph2EndToEnd.Match.newMatch((EDFDToGraph) parameters[0], (GraphEndToEndTrace) parameters[1], (Identifiable) parameters[2], (Identifiable) parameters[3]);
  }

  /**
   * Inner class allowing the singleton instance of {@link Graph2EndToEnd} to be created 
   *     <b>not</b> at the class load time of the outer class, 
   *     but rather at the first call to {@link Graph2EndToEnd#instance()}.
   * 
   * <p> This workaround is required e.g. to support recursion.
   * 
   */
  private static class LazyHolder {
    private static final Graph2EndToEnd INSTANCE = new Graph2EndToEnd();

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
    private static final Graph2EndToEnd.GeneratedPQuery INSTANCE = new GeneratedPQuery();

    private final PParameter parameter_graph2endtoend = new PParameter("graph2endtoend", "traceability.EDFDToGraph", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/traceability", "EDFDToGraph")), PParameterDirection.INOUT);

    private final PParameter parameter_trace = new PParameter("trace", "traceability.GraphEndToEndTrace", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/traceability", "GraphEndToEndTrace")), PParameterDirection.INOUT);

    private final PParameter parameter_graphElements = new PParameter("graphElements", "graph.Identifiable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/graph", "Identifiable")), PParameterDirection.INOUT);

    private final PParameter parameter_endtoendElements = new PParameter("endtoendElements", "graph.Identifiable", new EClassTransitiveInstancesKey((EClass)getClassifierLiteralSafe("http://www.example.org/graph", "Identifiable")), PParameterDirection.INOUT);

    private final List<PParameter> parameters = Arrays.asList(parameter_graph2endtoend, parameter_trace, parameter_graphElements, parameter_endtoendElements);

    private GeneratedPQuery() {
      super(PVisibility.PUBLIC);
    }

    @Override
    public String getFullyQualifiedName() {
      return "edfdtosimplegraph.Graph2EndToEnd";
    }

    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("graph2endtoend","trace","graphElements","endtoendElements");
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
          PVariable var_graph2endtoend = body.getOrCreateVariableByName("graph2endtoend");
          PVariable var_trace = body.getOrCreateVariableByName("trace");
          PVariable var_graphElements = body.getOrCreateVariableByName("graphElements");
          PVariable var_endtoendElements = body.getOrCreateVariableByName("endtoendElements");
          new TypeConstraint(body, Tuples.flatTupleOf(var_graph2endtoend), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDToGraph")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "GraphEndToEndTrace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_graphElements), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          new TypeConstraint(body, Tuples.flatTupleOf(var_endtoendElements), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          body.setSymbolicParameters(Arrays.<ExportedParameter>asList(
             new ExportedParameter(body, var_graph2endtoend, parameter_graph2endtoend),
             new ExportedParameter(body, var_trace, parameter_trace),
             new ExportedParameter(body, var_graphElements, parameter_graphElements),
             new ExportedParameter(body, var_endtoendElements, parameter_endtoendElements)
          ));
          // 	EDFDToGraph.graphEndToEndTrace(graph2endtoend, trace)
          new TypeConstraint(body, Tuples.flatTupleOf(var_graph2endtoend), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "EDFDToGraph")));
          PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_graph2endtoend, var__virtual_0_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "EDFDToGraph", "graphEndToEndTrace")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_0_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "GraphEndToEndTrace")));
          new Equality(body, var__virtual_0_, var_trace);
          // 	GraphEndToEndTrace.graphElements(trace, graphElements)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "GraphEndToEndTrace")));
          PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_1_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "GraphEndToEndTrace", "graphElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_1_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          new Equality(body, var__virtual_1_, var_graphElements);
          // 	GraphEndToEndTrace.endtoendGraphElements(trace, endtoendElements)
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/traceability", "GraphEndToEndTrace")));
          PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
          new TypeConstraint(body, Tuples.flatTupleOf(var_trace, var__virtual_2_), new EStructuralFeatureInstancesKey(getFeatureLiteral("http://www.example.org/traceability", "GraphEndToEndTrace", "endtoendGraphElements")));
          new TypeConstraint(body, Tuples.flatTupleOf(var__virtual_2_), new EClassTransitiveInstancesKey((EClass)getClassifierLiteral("http://www.example.org/graph", "Identifiable")));
          new Equality(body, var__virtual_2_, var_endtoendElements);
          bodies.add(body);
      }
      return bodies;
    }
  }
}
