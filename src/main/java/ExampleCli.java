import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

public class ExampleCli {
   public static void main(String[] args) {
    Options options = new Options();
    Option option = new Option("opt", "option");
    
    // BasicParser is deprecated in 1.3
    CommandLineParser parser = new BasicParser();
  }
}
