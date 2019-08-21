/*
 * package com.walmart.rebates.JPAannotations; import java.io.InputStream;
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.apache.olingo.odata2.api.edm.provider.AnnotationAttribute; import
 * org.apache.olingo.odata2.api.edm.provider.EntityType; import
 * org.apache.olingo.odata2.api.edm.provider.Property; import
 * org.apache.olingo.odata2.api.edm.provider.Schema; import
 * org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmExtension; import
 * org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmSchemaView;
 * 
 * public class CustomAnnotationProcessor implements JPAEdmExtension{
 * 
 * @Override public void extendWithOperation(JPAEdmSchemaView view) { }
 * 
 * @Override public void extendJPAEdmSchema(JPAEdmSchemaView view) { Schema
 * edmSchema = view.getEdmSchema(); List<EntityType> entityTypeList =
 * edmSchema.getEntityTypes(); // if(entityTypeList != null) //
 * alterEntityTypes(entityTypeList); List<AnnotationAttribute> entityAnnotations
 * = null;
 * 
 * for(EntityType enType : entityTypeList ){
 * if(enType.getName().toString().equals("Demo_Enr") ||
 * enType.getName().toString().equals("CurrentContentPerStudent") ){
 * entityAnnotations = new ArrayList<AnnotationAttribute>(); AnnotationAttribute
 * entityAnnotation = new AnnotationAttribute();
 * entityAnnotation.setName("semantics"); entityAnnotation.setText("aggregate");
 * entityAnnotation.setPrefix("sap");
 * entityAnnotation.setNamespace("http://www.sap.com/Protocols/SAPData");
 * entityAnnotations.add(entityAnnotation);
 * enType.setAnnotationAttributes(entityAnnotations); List<AnnotationAttribute>
 * propertyAnnotations = null; List<Property>entityProperty =
 * enType.getProperties(); for(Property prop : entityProperty){
 * 
 * AnnotationAttribute propertyAnnotationAggregation = null; AnnotationAttribute
 * propertyAnnotationLabel = null; propertyAnnotations = new
 * ArrayList<AnnotationAttribute>(); //aggregation propertyAnnotationAggregation
 * = new AnnotationAttribute(); if (prop.getName() == "StudentID" ||
 * prop.getName().toString().equals("StudentID")){
 * propertyAnnotationAggregation.setText("measure"); }else{
 * propertyAnnotationAggregation.setText("dimension"); }
 * propertyAnnotationAggregation.setName("sap:aggregation-role");
 * propertyAnnotationAggregation.setPrefix("sap");
 * propertyAnnotations.add(propertyAnnotationAggregation);
 * 
 * //labels propertyAnnotationLabel = new AnnotationAttribute();
 * propertyAnnotationLabel.setName("sap:label");
 * propertyAnnotationLabel.setText(prop.getName());
 * propertyAnnotationLabel.setPrefix("sap");
 * propertyAnnotations.add(propertyAnnotationLabel) ;
 * 
 * prop.setAnnotationAttributes(propertyAnnotations); } } } }
 * 
 * @Override public InputStream getJPAEdmMappingModelStream() { // TODO
 * Auto-generated method stub return null; }
 * 
 * }
 */