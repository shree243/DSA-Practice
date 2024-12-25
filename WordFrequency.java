import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {

    public static List<WordFreqPair> getMostFrequentWords(InputStream stream, int n) throws IOException {
        // Create a BufferedReader to read the stream
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            // Use Stream API to process words and collect their frequencies
            Map<String, Long> wordCount = reader.lines()
                .flatMap(line -> Arrays.stream(line.split("\\s+"))) // Split lines into words
                .map(String::toLowerCase) // Normalize to lowercase
                .collect(Collectors.groupingBy(word -> word, Collectors.counting())); // Count occurrences

            // Sort words by frequency in descending order and limit to top 'n'
            return wordCount.entrySet().stream()
                .sorted((a, b) -> Long.compare(b.getValue(), a.getValue())) // Sort by frequency descending
                .limit(n) // Limit to top 'n' items
                .map(entry -> new WordFreqPair(entry.getKey(), entry.getValue().intValue())) // Map to WordFreqPair
                .collect(Collectors.toList()); // Collect into a list
        }
    }

    // Test the method
    public static void main(String[] args) throws IOException {
        String input = "hello world hello Java world world Java Java Python Python";
        InputStream stream = new java.io.ByteArrayInputStream(input.getBytes(java.nio.charset.StandardCharsets.UTF_8));
        List<WordFreqPair> result = getMostFrequentWords(stream, 3);
        result.forEach(pair -> System.out.println(pair.word + ": " + pair.freq));
    }
}

// Supporting class
class WordFreqPair {
    public WordFreqPair(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }

    public String word;
    public int freq;
}
