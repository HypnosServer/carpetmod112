package carpet.communications;

import java.io.*;
import java.util.Properties;

public class DiscordConfiguration {
    public static final File discordConfigurationFilePath = new File("discordConfiguration.conf");

    //some variables that make sense later in the code (but i overexplain my classes anyways so why bother?)
    //DEFAULTS
    public static boolean discordBotEnabled = true;
    public static boolean recieveFromDiscord = true;
    public static boolean sendToDiscord = true;

    public static String discordMessagePrefix = ''; //normally no prefix \_(._.)_/

    public static String botToken;
    public static String recievingChannel;

    public static void discordConfigFirstRun() {
        if (!discordConfigurationFilePath.exists()) {
            try {
                boolean fileCreatedSuccessfully = discordConfigurationFilePath.createNewFile();
                if (fileCreatedSuccessfully) {
                    Properties properties = new Properties();
                    BufferedReader fileInStream = new BufferedReader(new FileReader(discordConfigurationFilePath));
                    properties.load(fileIStream);
                    fileIStream.close();

                    BufferedWriter fileOutStream = new BufferedReader(new FileReader(discordConfigurationFilePath));

                }
            } catch (IOStream err) {
                err.ShowStackTrace();
            }
        }
    }
}