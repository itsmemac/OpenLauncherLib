/*
 * Copyright 2015-2017 Adrien "Litarvan" Navratil
 *
 * This file is part of the OpenLauncherLib.

 * The OpenLauncherLib is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The OpenLauncherLib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the OpenLauncherLib.  If not, see <http://www.gnu.org/licenses/>.
 */
package fr.theshark34.openlauncherlib.minecraft;

/**
 * The Auth Infos
 *
 * <p>
 * The Auth Infos containing the player username, and the access token given
 * by the authentication.
 * </p>
 *
 * @author Litarvan
 * @version 3.0.4
 * @since 2.0.0-SNAPSHOT
 */
public class AuthInfos
{
    /**
     * The player username
     */
    private final String username;

    /**
     * The access token given by the authentication
     */
    private final String accessToken;

    /**
     * The (optional) client token given to the Authenticator
     */
    private String clientToken;

    /**
     * The (optional) client id from the microsoft authenticator
     */
    private String clientId = "x";

    /**
     * The (optional) auth xbox id from the microsoft authenticator
     */
    private String authXUID = "x";

    /**
     * The uuid given by the authentication
     */
    private final String uuid;

    /**
     * Basic constructor
     *
     * @param username    The player username
     * @param accessToken The access token given by the authentication
     * @param uuid        The player UUID
     */
    public AuthInfos(String username, String accessToken, String uuid)
    {
        this.username    = username;
        this.accessToken = accessToken;
        this.uuid        = uuid;
    }

    /**
     * Basic constructor
     *
     * @param username    The player username
     * @param accessToken The access token given by the authentication
     * @param uuid        The player UUID
     * @param authXUID The auth xbox id from the microsoft authenticator
     * @param clientId The client id from the microsoft authenticator
     */
    public AuthInfos(String username, String accessToken, String uuid, String authXUID, String clientId)
    {
        this(username, accessToken, uuid);
        this.authXUID = authXUID;
        this.clientId = clientId;
    }

    /**
     * Basic constructor
     *
     * @param username    The player username
     * @param accessToken The access token given by the authentication
     * @param clientToken The (optional) client token given to the Authenticator
     * @param uuid        The player UUID
     */
    public AuthInfos(String username, String accessToken, String clientToken, String uuid)
    {
        this(username, accessToken, uuid);
        this.clientToken = clientToken;
    }

    /**
     * Basic constructor
     *
     * @param username    The player username
     * @param accessToken The access token given by the authentication
     * @param clientToken The (optional) client token given to the Authenticator
     * @param uuid        The player UUID
     * @param authXUID The auth xbox id from the microsoft authenticator
     * @param clientId The client id from the microsoft authenticator
     */
    public AuthInfos(String username, String accessToken, String clientToken, String uuid, String authXUID, String clientId)
    {
        this(username, accessToken, clientToken, uuid);
        this.authXUID = authXUID;
        this.clientId = clientId;
    }

    /**
     * @return The player username
     */
    public String getUsername()
    {
        return this.username;
    }

    /**
     * @return The access token given by the authentication
     */
    public String getAccessToken()
    {
        return this.accessToken;
    }

    /**
     * @return The (optional) client token given to the Authenticator
     */
    public String getClientToken()
    {
        return clientToken;
    }

    /**
     * @return The uuid given by the authentication
     */
    public String getUuid()
    {
        return this.uuid;
    }

    public String getAuthXUID()
    {
        return this.authXUID;
    }

    public String getClientId()
    {
        return this.clientId;
    }
}
