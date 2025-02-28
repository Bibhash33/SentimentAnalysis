Sentiment Analysis Project (Java + Weka)

This project is a simple sentiment analysis tool built in Java using the Weka library. It takes a piece of text as input and predicts the sentiment of the text — whether it’s Positive, Negative, or Neutral. Instead of using a pre-trained model, we trained our own model on a custom dataset.







How This Works:-

1. Training the Model:

We collected a dataset of text labeled with sentiments.

The model was trained using Weka’s machine learning algorithms.

The trained model was saved as sentiment-model.model.



2. Predicting Sentiment:

A user enters a sentence.

The text is preprocessed (cleaned and formatted).

The model predicts the sentiment (Positive, Negative, or Neutral).








How to Run:-

1. Set up your environment:

Install Java (JDK).

Add Weka library to your project’s classpath.



2. Train the model (if needed):

Run SentimentTrainer.java to train a new model and save it.



3. Predict sentiment:

Use SentimentPredictor.java to input text and get a sentiment prediction.









Example Output:-

String text = "I love this product!";
String sentiment = SentimentPredictor.predict(text);
System.out.println("Predicted Sentiment: " + sentiment);

Output:-

Predicted Sentiment: Positive







Libraries Used:-

Java (JDK 17)

Weka 3.8.6






Future Improvements:-

Add more sentiment categories (like Angry, Sad, Excited).

Improve text preprocessing (like removing stopwords and stemming).

Use more advanced models for better accuracy.


