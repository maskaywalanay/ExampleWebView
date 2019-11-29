package ngopi.malam.gaes;

import android.app.*;
import android.os.*;
import android.webkit.*;
import java.net.*;
import android.webkit.WebViewClient;
import android.webkit.WebView;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		WebView mWebView = (WebView)findViewById(R.id.examplesweb);
		String url = "http://www.google.com";
		
		mWebView.setWebViewClient(new myWebViewClient());
		mWebView.getSettings().setJavaScriptEnabled(true);
		mWebView.loadUrl(url);
		
		}
		
	private class myWebViewClient extends WebViewClient
	{

		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url)
		{
			// TODO: Implement this method
			view.loadUrl(url);
			return true;
		}
			
			
		}
    
}
