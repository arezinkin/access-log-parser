public class LogParserExceptionsLengthLineInFile extends RuntimeException {

    public LogParserExceptionsLengthLineInFile(String path, int numberString, int lengthOfLine){
        super("the file '" + path + "' contains unprocessed line number " + numberString +  ", which contains more than 1024 characters: " + lengthOfLine);
    }


}
