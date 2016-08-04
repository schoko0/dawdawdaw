package Übungen.MockitoÜbungen.Twitter;

import org.junit.Test;
import org.mockito.InjectMocks;


import static org.mockito.Mockito.*;


public class TwitterTest {
    @InjectMocks
    private ITweet iTweet;


    @Test
    public void testSendingTweet(){
        TwitterClient twitterClient = new TwitterClient();

//        ITweet iTweet = mock(ITweet.class);
        doReturn("Using Mockito is great").when(iTweet.getMessage());
//        when(iTweet.getMessage()).thenReturn("Using mockito is great");
//        when(iTweet.getMessage()).thenReturn("Using mockito is great");
        twitterClient.sendTweet(iTweet);
        System.out.println(iTweet.getMessage());
        verify(iTweet, atLeast(1)).getMessage();
    }


}
