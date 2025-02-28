package com.sentimentanalysis;
import weka.core.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;


public class DataLoader {
    public static Instances loadDataset(String filepath) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(filepath));
        ArrayList<Attributes> attributes = new Arraylist<>();
        attributes.add(new Attribute("text",ArrayList(<String>) null));
        ArrayList<String> classValues = new ArrayList<>();
        classValues.add("Positive");
        classValues.add("Negative");
        classValues.add("Neutral");
        Attributes.add(new Attributes("class",classValues));
        Instances dataset = new Instances("SentimentData",attributes,0);
        dataset.setClassIndex(dataset.Attributes()-1);
        String parts;
        while(line=reader.readLine()!=null){
            String[] text = line.split(",");
            String text = TextPreprocessor.preprocess(parts[0]);
            String sentiment = part[1];
            Instance instance = DenseInstance(2);
            instance.setValue(attributes.get(0), text);
            instance.setValue(attributes.get(1), sentimeny);
            dataset.add(instance);
            
        }
        
    reader.close();
    return dataset;
        
    }
    
	
}