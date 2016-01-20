package org.mariotaku.twidere.api.twitter;

import org.mariotaku.restfu.annotation.method.POST;
import org.mariotaku.restfu.annotation.param.Header;
import org.mariotaku.restfu.annotation.param.KeyValue;
import org.mariotaku.restfu.annotation.param.Params;
import org.mariotaku.twidere.api.twitter.auth.OAuth2GetTokenHeader;
import org.mariotaku.twidere.api.twitter.auth.OAuth2Token;

/**
 * Created by mariotaku on 16/1/4.
 */
public interface TwitterOAuth2 {

    @POST("/oauth2/token")
    @Params(@KeyValue(key = "grant_type", value = "client_credentials"))
    OAuth2Token getApplicationOnlyAccessToken(@Header("Authorization") OAuth2GetTokenHeader token)
            throws TwitterException;
}
