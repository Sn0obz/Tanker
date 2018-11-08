/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.tanker3;


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your Tankstelle data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "Tanker3",
    hooksClassNameTransient = "com.apiomat.nativemodule.tanker3.TankstelleHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.tanker3.TankstelleHooksNonTransient", 
    isTransient = true,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Tankstelle extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.tanker3.Tankstelle> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.tanker3.Tankstelle>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "Tanker3";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Tankstelle";

    /** class specific attributes */
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String areaPictureURL;
    private String brand = null;
    private String city = null;
    private Double diesel = null;
    private Double e10 = null;
    private Double e5 = null;
    private double[] loc;
    private String name = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Tankstelle ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getAreaPictureURL( )
    {
        return this.areaPictureURL;
    }

    public byte[] loadAreaPicture( )
    {
        final String resUrl = getAreaPictureURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public java.io.InputStream loadAreaPictureAsStream( )
    {
        final String resUrl = getAreaPictureURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public String getAreaPictureURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final java.lang.StringBuilder additionalParameters = new java.lang.StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getAreaPictureURL( ) + additionalParameters;
    }

    public byte[] loadAreaPicture( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getAreaPictureURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setAreaPictureURL( String url ) 
    {
        this.areaPictureURL = url;
    }

    /**
     * @deprecated Use {@link #postAreaPicture( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postAreaPicture( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setAreaPictureURL( url );
        return url;
    }

    public String postAreaPicture( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setAreaPictureURL( url );
        return url;
    }

    public String getBrand()
    {
         return this.brand;
    }

    public void setBrand( String arg )
    {
        this.brand = arg;
    }

    public String getCity()
    {
         return this.city;
    }

    public void setCity( String arg )
    {
        this.city = arg;
    }

    public Double getDiesel()
    {
         return this.diesel;
    }

    public void setDiesel( Double arg )
    {
        this.diesel = arg;
    }

    public Double getE10()
    {
         return this.e10;
    }

    public void setE10( Double arg )
    {
        this.e10 = arg;
    }

    public Double getE5()
    {
         return this.e5;
    }

    public void setE5( Double arg )
    {
        this.e5 = arg;
    }

    public double getLocLatitude( )
    {
         return this.loc !=null && this.loc.length > 0 ? this.loc[0] : 0;
    }

    public double getLocLongitude( )
    {
         return this.loc !=null && this.loc.length > 1 ? this.loc[1] : 0;
    }

    public void setLocLatitude( double latitude )
    {
        if( this.loc == null )
        {
            this.loc = new double[]{};
        }

        if ( this.loc.length < 2 )
        {
            this.loc = new double[]{ latitude, 0 };
        }
        else
        {
            this.loc[0] = latitude;
        }
    }

    public void setLocLongitude( double longitude )
    {
        if( this.loc == null )
        {
            this.loc = new double[]{};
        }

        if ( this.loc.length < 2 )
        {
            this.loc = new double[]{ 0, longitude };
        }
        else
        {
            this.loc[1] = longitude;
        }
    }

    public String getName()
    {
         return this.name;
    }

    public void setName( String arg )
    {
        this.name = arg;
    }

}
