

/* First created by JCasGen Mon May 18 10:57:19 CDT 2015 */
package clinicalnlp.dict.uima;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.cas.FSArray;
import org.apache.uima.jcas.cas.TOP;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon May 18 10:57:19 CDT 2015
 * XML source: C:/WKT/git/ClinicalNLP/nlp-components/component-dictionary/src/main/resources/descriptors/DictionaryTypeSystem.xml
 * @generated */
public class DictMatch extends TOP {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DictMatch.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected DictMatch() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DictMatch(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DictMatch(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: matched

  /** getter for matched - gets 
   * @generated
   * @return value of the feature 
   */
  public FSArray getMatched() {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "clinicalnlp.dict.uima.DictMatch");
    return (FSArray)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched)));}
    
  /** setter for matched - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMatched(FSArray v) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "clinicalnlp.dict.uima.DictMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched, jcasType.ll_cas.ll_getFSRef(v));}    
    
  /** indexed getter for matched - gets an indexed value - 
   * @generated
   * @param i index in the array to get
   * @return value of the element at index i 
   */
  public TOP getMatched(int i) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "clinicalnlp.dict.uima.DictMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched), i);
    return (TOP)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched), i)));}

  /** indexed setter for matched - sets an indexed value - 
   * @generated
   * @param i index in the array to set
   * @param v value to set into the array 
   */
  public void setMatched(int i, TOP v) { 
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_matched == null)
      jcasType.jcas.throwFeatMissing("matched", "clinicalnlp.dict.uima.DictMatch");
    jcasType.jcas.checkArrayBounds(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched), i);
    jcasType.ll_cas.ll_setRefArrayValue(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_matched), i, jcasType.ll_cas.ll_getFSRef(v));}
   
    
  //*--------------*
  //* Feature: canonical

  /** getter for canonical - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCanonical() {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_canonical == null)
      jcasType.jcas.throwFeatMissing("canonical", "clinicalnlp.dict.uima.DictMatch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_canonical);}
    
  /** setter for canonical - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCanonical(String v) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_canonical == null)
      jcasType.jcas.throwFeatMissing("canonical", "clinicalnlp.dict.uima.DictMatch");
    jcasType.ll_cas.ll_setStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_canonical, v);}    
   
    
  //*--------------*
  //* Feature: code

  /** getter for code - gets 
   * @generated
   * @return value of the feature 
   */
  public String getCode() {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "clinicalnlp.dict.uima.DictMatch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_code);}
    
  /** setter for code - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setCode(String v) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_code == null)
      jcasType.jcas.throwFeatMissing("code", "clinicalnlp.dict.uima.DictMatch");
    jcasType.ll_cas.ll_setStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_code, v);}    
   
    
  //*--------------*
  //* Feature: vocabulary

  /** getter for vocabulary - gets 
   * @generated
   * @return value of the feature 
   */
  public String getVocabulary() {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_vocabulary == null)
      jcasType.jcas.throwFeatMissing("vocabulary", "clinicalnlp.dict.uima.DictMatch");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_vocabulary);}
    
  /** setter for vocabulary - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setVocabulary(String v) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_vocabulary == null)
      jcasType.jcas.throwFeatMissing("vocabulary", "clinicalnlp.dict.uima.DictMatch");
    jcasType.ll_cas.ll_setStringValue(addr, ((DictMatch_Type)jcasType).casFeatCode_vocabulary, v);}    
   
    
  //*--------------*
  //* Feature: container

  /** getter for container - gets 
   * @generated
   * @return value of the feature 
   */
  public Annotation getContainer() {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_container == null)
      jcasType.jcas.throwFeatMissing("container", "clinicalnlp.dict.uima.DictMatch");
    return (Annotation)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_container)));}
    
  /** setter for container - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setContainer(Annotation v) {
    if (DictMatch_Type.featOkTst && ((DictMatch_Type)jcasType).casFeat_container == null)
      jcasType.jcas.throwFeatMissing("container", "clinicalnlp.dict.uima.DictMatch");
    jcasType.ll_cas.ll_setRefValue(addr, ((DictMatch_Type)jcasType).casFeatCode_container, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    