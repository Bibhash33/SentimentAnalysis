package com.sentimentanalysis;

import java.util.Scanner;

public class SentimentAnalysis{
	public static void main(String[] args)throws Exception{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text to analyze the sentiment: ");
		String InputText = scanner.nextLine();
		scanner.close();
		String sentiment = SentimentPredictor.predict(InputText);
		System.out.println("Predicted Sentiment: "+sentiment);
		}
	
	}