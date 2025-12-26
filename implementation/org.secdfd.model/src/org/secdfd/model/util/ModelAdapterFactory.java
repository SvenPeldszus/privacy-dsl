/**
 */
package org.secdfd.model.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.secdfd.model.Asset;
import org.secdfd.model.Assumption;
import org.secdfd.model.AttackerProfile;
import org.secdfd.model.ClassificationContract;
import org.secdfd.model.ClusteringContract;
import org.secdfd.model.DecisionMakingContract;
import org.secdfd.model.RecommendationContract;
import org.secdfd.model.PredictionContract;
import org.secdfd.model.ContractBase;
import org.secdfd.model.DataStore;
import org.secdfd.model.EDFD;
import org.secdfd.model.Element;
import org.secdfd.model.ExternalEntity;
import org.secdfd.model.Flow;
import org.secdfd.model.MLContract;
import org.secdfd.model.ModelPackage;
import org.secdfd.model.NamedEntity;
import org.secdfd.model.SecurityContract;
import org.secdfd.model.TrustZone;
import org.secdfd.model.Value;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.secdfd.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseAsset(Asset object) {
				return createAssetAdapter();
			}
			@Override
			public Adapter caseProcess(org.secdfd.model.Process object) {
				return createProcessAdapter();
			}
			@Override
			public Adapter caseEDFD(EDFD object) {
				return createEDFDAdapter();
			}
			@Override
			public Adapter caseDataStore(DataStore object) {
				return createDataStoreAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseExternalEntity(ExternalEntity object) {
				return createExternalEntityAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedEntity(NamedEntity object) {
				return createNamedEntityAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseAssumption(Assumption object) {
				return createAssumptionAdapter();
			}
			@Override
			public Adapter caseAttackerProfile(AttackerProfile object) {
				return createAttackerProfileAdapter();
			}
			@Override
			public Adapter caseTrustZone(TrustZone object) {
				return createTrustZoneAdapter();
			}
			@Override
			public Adapter caseContractBase(ContractBase object) {
				return createContractBaseAdapter();
			}
			@Override
			public Adapter caseSecurityContract(SecurityContract object) {
				return createSecurityContractAdapter();
			}
			@Override
			public Adapter caseMLContract(MLContract object) {
				return createMLContractAdapter();
			}
			@Override
			public Adapter caseClassificationContract(ClassificationContract object) {
				return createClassificationContractAdapter();
			}
			@Override
			public Adapter caseClusteringContract(ClusteringContract object) {
				return createClusteringContractAdapter();
			}
			@Override
			public Adapter caseDecisionMakingContract(DecisionMakingContract object) {
				return createDecisionMakingContractAdapter();
			}
			@Override
			public Adapter caseRecommendationContract(RecommendationContract object) {
				return createRecommendationContractAdapter();
			}
			@Override
			public Adapter casePredictionContract(PredictionContract object) {
				return createPredictionContractAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Process
	 * @generated
	 */
	public Adapter createProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.EDFD <em>EDFD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.EDFD
	 * @generated
	 */
	public Adapter createEDFDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.DataStore <em>Data Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.DataStore
	 * @generated
	 */
	public Adapter createDataStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.ExternalEntity <em>External Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.ExternalEntity
	 * @generated
	 */
	public Adapter createExternalEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.NamedEntity <em>Named Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.NamedEntity
	 * @generated
	 */
	public Adapter createNamedEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.Assumption <em>Assumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.Assumption
	 * @generated
	 */
	public Adapter createAssumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.AttackerProfile <em>Attacker Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.AttackerProfile
	 * @generated
	 */
	public Adapter createAttackerProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.TrustZone <em>Trust Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.TrustZone
	 * @generated
	 */
	public Adapter createTrustZoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.ContractBase <em>Contract Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.ContractBase
	 * @generated
	 */
	public Adapter createContractBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.SecurityContract <em>Security Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.SecurityContract
	 * @generated
	 */
	public Adapter createSecurityContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.MLContract <em>ML Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.MLContract
	 * @generated
	 */
	public Adapter createMLContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.ClassificationContract <em>Classification Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.ClassificationContract
	 * @generated
	 */
	public Adapter createClassificationContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.ClusteringContract <em>Clustering Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.ClusteringContract
	 * @generated
	 */
	public Adapter createClusteringContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.DecisionMakingContract <em>Decision Making Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.DecisionMakingContract
	 * @generated
	 */
	public Adapter createDecisionMakingContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.RecommendationContract <em>Recommendation Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.RecommendationContract
	 * @generated
	 */
	public Adapter createRecommendationContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.secdfd.model.PredictionContract <em>Prediction Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.secdfd.model.PredictionContract
	 * @generated
	 */
	public Adapter createPredictionContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
