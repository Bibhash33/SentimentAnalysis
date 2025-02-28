package com.sentimentanalysis;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.Classifier;
import weka.core.Instances;
import weka.core.SerializationHelper;


public class ModelTrainer {
	public static void trainModel(String dataFile, String modelFile) throws Exception{
	    Instances dataset = DataLoader.loadDataset(dataFile);
	    NaiveBayes model = new NaiveBayes();
	    model.buildClassifier(dataset);
	    SerializationHelper.write(modelFile,model);
	    System.out.println("Model trained sucessfully.");
		
	}
    public static void main(String[] args){
        trainModel("data.csv","Model/sentiment-model.model");
    }
}