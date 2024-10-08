
package com.sponteeducacional;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.0.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSAPIEdu", targetNamespace = "http://api.sponteeducacional.net.br/", wsdlLocation = "file:/home/cauan/IdeaProjects/api_sponte/WSAPIEdu.wsdl")
public class WSAPIEdu
    extends Service
{

    private final static URL WSAPIEDU_WSDL_LOCATION;
    private final static WebServiceException WSAPIEDU_EXCEPTION;
    private final static QName WSAPIEDU_QNAME = new QName("http://api.sponteeducacional.net.br/", "WSAPIEdu");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/cauan/IdeaProjects/api_sponte/WSAPIEdu.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSAPIEDU_WSDL_LOCATION = url;
        WSAPIEDU_EXCEPTION = e;
    }

    public WSAPIEdu() {
        super(__getWsdlLocation(), WSAPIEDU_QNAME);
    }

    public WSAPIEdu(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSAPIEDU_QNAME, features);
    }

    public WSAPIEdu(URL wsdlLocation) {
        super(wsdlLocation, WSAPIEDU_QNAME);
    }

    public WSAPIEdu(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSAPIEDU_QNAME, features);
    }

    public WSAPIEdu(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSAPIEdu(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSAPIEduSoap
     */
    @WebEndpoint(name = "WSAPIEduSoap")
    public WSAPIEduSoap getWSAPIEduSoap() {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduSoap"), WSAPIEduSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAPIEduSoap
     */
    @WebEndpoint(name = "WSAPIEduSoap")
    public WSAPIEduSoap getWSAPIEduSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduSoap"), WSAPIEduSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WSAPIEduSoap
     */
    @WebEndpoint(name = "WSAPIEduSoap12")
    public WSAPIEduSoap getWSAPIEduSoap12() {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduSoap12"), WSAPIEduSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAPIEduSoap
     */
    @WebEndpoint(name = "WSAPIEduSoap12")
    public WSAPIEduSoap getWSAPIEduSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduSoap12"), WSAPIEduSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WSAPIEduHttpGet
     */
    @WebEndpoint(name = "WSAPIEduHttpGet")
    public WSAPIEduHttpGet getWSAPIEduHttpGet() {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduHttpGet"), WSAPIEduHttpGet.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAPIEduHttpGet
     */
    @WebEndpoint(name = "WSAPIEduHttpGet")
    public WSAPIEduHttpGet getWSAPIEduHttpGet(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduHttpGet"), WSAPIEduHttpGet.class, features);
    }

    /**
     * 
     * @return
     *     returns WSAPIEduHttpPost
     */
    @WebEndpoint(name = "WSAPIEduHttpPost")
    public WSAPIEduHttpPost getWSAPIEduHttpPost() {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduHttpPost"), WSAPIEduHttpPost.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSAPIEduHttpPost
     */
    @WebEndpoint(name = "WSAPIEduHttpPost")
    public WSAPIEduHttpPost getWSAPIEduHttpPost(WebServiceFeature... features) {
        return super.getPort(new QName("http://api.sponteeducacional.net.br/", "WSAPIEduHttpPost"), WSAPIEduHttpPost.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSAPIEDU_EXCEPTION!= null) {
            throw WSAPIEDU_EXCEPTION;
        }
        return WSAPIEDU_WSDL_LOCATION;
    }

}
