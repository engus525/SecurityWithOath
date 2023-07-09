package com.example.oauthstudy.auth.userinfo;

import java.util.Map;

public class GoogleUserInfo implements OAuth2UserInfo
{
    private final Map<String, Object> attributes;

    public GoogleUserInfo(Map<String, Object> attributes)
    {
        this.attributes = attributes;
    }

    @Override
    public Map<String, Object> getAttributes()
    {
        return this.attributes;
    }

    @Override
    public String getProviderId()
    {
        return this.attributes.get("sub").toString();
    }

    @Override
    public String getProvider()
    {
        return "google";
    }

    @Override
    public String getEmail()
    {
        return this.attributes.get("email").toString();
    }

    @Override
    public String getName()
    {
        return this.attributes.get("name").toString();
    }
}
