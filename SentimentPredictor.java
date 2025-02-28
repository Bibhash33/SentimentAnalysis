import weka.classifiers.Classifier;
import weka.core.*;
import weka.core.SerializationHelper;
import java.util.ArrayList;


public class SentimentPredictor {
	private static Classifier model;
    private static Instances DataStructure;
    static{
        try
        {
        model = (Classifier)SerializationHelper.read("Model/sentiment-model.model");
        ArrayList<Attribute> attributes = new ArrayList<>();
        attributes.add(new Attribute("text",(ArrayList<String>) null));
        ArrayList<String> classValues = new ArrayList<>();
        classValues.add("Positive");
        classValues.add("Negative");
        classValues.add("Neutral");
        
        attributes.add(new Attribute("class",classValues));
        datasetStructure = new Instances("SentimentData",attributes,0);
        datasetStructure.setClassIndex(datasetStructure.numAttributes() -1);
        
        
    }
    catch(Exception e){
        e.printStackTrace();
        
    }
    }
    
    public static String predict(String text) throws Exception{
        String processedText = TextPreprocessor.preprocess(text);
        Instance instance = new DenseInstance(2);
        instance.setValue(datasetStructure.attribute(0),processedText);
        datasetStructure.add(instance);
        instance.setDataset(datasetStructure);
        double predictionIndex = model.classifyInstance(instance);
            return datasetStructure.classAttribute().value((int) predictionIndex);
    }
}