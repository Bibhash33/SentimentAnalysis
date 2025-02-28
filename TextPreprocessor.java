import opennlp.tools.tokenize.SimpleTokenizer;
import java.util.Arrays;
import java.util.Hashset;
import java.util.Set;


public class TextPreprocessor{
    private static final Set<String> STOPWORDS = new HashSet<>(Arrays.asList("is", "the", "a", "an", "this", "that", "to", "and", "for"));
    
    public static String preprocess(String text){
        SimpleTokenizer tokenizer = SimpleTokenizer.INSTANCE;
        String[] tokens = tokenizer.tozenize(text.toLowerCase());
        StringBuilder processedText = new StringBuilder();
    }
    
    for(String token : tokens){
        if(!STOPWORDS.contains(token)){
            processedText.append(token).append(" ");
            
        }
    }
    return processedText.toString().trim();
		
	}