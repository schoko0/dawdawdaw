package Übungen.MockitoÜbungen;

import org.junit.Test;


import static org.mockito.Mockito.*;


public class Aufruf {


    @Test
    public void testSendingTweet(){
        TwitterClient twitterClient = new TwitterClient();

        ITweet iTweet = mock(ITweet.class);

        when(iTweet.getMessage()).thenReturn("Using mockito is great");
        when(iTweet.getMessage()).thenReturn("Using mockito is great");
        twitterClient.sendTweet(iTweet);
        System.out.println(iTweet.getMessage());
        verify(iTweet, atLeast(2)).getMessage();
    }


}
