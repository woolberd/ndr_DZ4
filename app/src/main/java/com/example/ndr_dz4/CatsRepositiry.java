package com.example.ndr_dz4;

import java.util.ArrayList;

public class CatsRepositiry {
    private final ArrayList<CatModel> catModelList = new ArrayList<>();

    public ArrayList<CatModel> getListOfCatHIP() {
        catModelList.add(new CatModel("https://http.cat/100", "Continue"));
        catModelList.add(new CatModel("https://http.cat/101", "Switching Protocols"));
        catModelList.add(new CatModel("https://http.cat/102", "Processing"));
        catModelList.add(new CatModel("https://http.cat/103", "Early Hints"));
        catModelList.add(new CatModel("https://http.cat/200", "OK"));
        catModelList.add(new CatModel("https://http.cat/201", "Created"));
        catModelList.add(new CatModel("https://http.cat/202", "Accepted"));
        catModelList.add(new CatModel("https://http.cat/203", "Non-Authoritative Information"));
        catModelList.add(new CatModel("https://http.cat/204", "No Content"));
        catModelList.add(new CatModel("https://http.cat/206", "Partial Content"));
        catModelList.add(new CatModel("https://http.cat/207", "Multi-Status"));
        catModelList.add(new CatModel("https://http.cat/300", "Multiple Choices"));
        catModelList.add(new CatModel("https://http.cat/301", "Moved Permanently"));
        catModelList.add(new CatModel("https://http.cat/302", "Found"));
        catModelList.add(new CatModel("https://http.cat/303", "See Other"));
        catModelList.add(new CatModel("https://http.cat/304", "Not Modified"));
        catModelList.add(new CatModel("https://http.cat/305", "Use Proxy"));
        catModelList.add(new CatModel("https://http.cat/307", "Temporary Redirect"));
        catModelList.add(new CatModel("https://http.cat/308", "Permanent Redirect"));
        catModelList.add(new CatModel("https://http.cat/400", "Bad Request"));
        catModelList.add(new CatModel("https://http.cat/401", "Unauthorized"));
        catModelList.add(new CatModel("https://http.cat/402", "Payment Required"));
        catModelList.add(new CatModel("https://http.cat/403", "Forbidden"));
        catModelList.add(new CatModel("https://http.cat/404", "Not Found"));
        catModelList.add(new CatModel("https://http.cat/405", "Method Not Allowed"));
        catModelList.add(new CatModel("https://http.cat/406", "Not Acceptable"));
        catModelList.add(new CatModel("https://http.cat/407", "Proxy Authentication Required"));
        catModelList.add(new CatModel("https://http.cat/408", "Request Timeout"));
        catModelList.add(new CatModel("https://http.cat/409", "Conflict"));
        catModelList.add(new CatModel("https://http.cat/410", "Gone"));
        catModelList.add(new CatModel("https://http.cat/411", "Length Required"));
        catModelList.add(new CatModel("https://http.cat/412", "Precondition Failed"));
        catModelList.add(new CatModel("https://http.cat/413", "Payload Too Large"));
        catModelList.add(new CatModel("https://http.cat/414", "Request-URI Too Long"));
        catModelList.add(new CatModel("https://http.cat/415", "Unsupported Media Type"));
        catModelList.add(new CatModel("https://http.cat/416", "Request Range Satisfiable"));
        catModelList.add(new CatModel("https://http.cat/417", "Expectation Failed"));
        catModelList.add(new CatModel("https://http.cat/418", "I'm a teapot"));
        catModelList.add(new CatModel("https://http.cat/420", "Enhance Your Calm"));
        catModelList.add(new CatModel("https://http.cat/421", "Misdirected Request"));
        catModelList.add(new CatModel("https://http.cat/422", "Unprocessable Entity"));
        catModelList.add(new CatModel("https://http.cat/423", "Locked"));
        catModelList.add(new CatModel("https://http.cat/424", "Failed Dependency"));
        catModelList.add(new CatModel("https://http.cat/425", "Too Early"));
        catModelList.add(new CatModel("https://http.cat/426", "Upgrade Requested"));
        catModelList.add(new CatModel("https://http.cat/429", "Too Many Requested"));
        catModelList.add(new CatModel("https://http.cat/431", "Request Header Fields Too Large"));
        catModelList.add(new CatModel("https://http.cat/444", "No Response"));
        catModelList.add(new CatModel("https://http.cat/450", "Blocked Windows Parental Controls"));
        catModelList.add(new CatModel("https://http.cat/451", "Unavailable For Legal Reasons"));
        catModelList.add(new CatModel("https://http.cat/497", "HTTP Request Sent HTTPS Port"));
        catModelList.add(new CatModel("https://http.cat/498", "Token expired/invalid"));
        catModelList.add(new CatModel("https://http.cat/499", "Client Closed Request"));
        catModelList.add(new CatModel("https://http.cat/500", "Internal Server Error"));
        catModelList.add(new CatModel("https://http.cat/501", "Not Implemented"));
        catModelList.add(new CatModel("https://http.cat/502", "Bad Gateway"));
        catModelList.add(new CatModel("https://http.cat/503", "Service Unavailable"));
        catModelList.add(new CatModel("https://http.cat/504", "Gateway Timeout"));
        catModelList.add(new CatModel("https://http.cat/506", "Variant Also Negotiates"));
        catModelList.add(new CatModel("https://http.cat/507", "Insuffcient Storage"));
        catModelList.add(new CatModel("https://http.cat/508", "Loop Detected"));
        catModelList.add(new CatModel("https://http.cat/509", "Bandwidth Limit Exceeded"));
        catModelList.add(new CatModel("https://http.cat/510", "Not Extended"));
        catModelList.add(new CatModel("https://http.cat/511", "Network Authentication Required"));
        catModelList.add(new CatModel("https://http.cat/521", "Web Server Is Down"));
        catModelList.add(new CatModel("https://http.cat/522", "Connection Timeout Out"));
        catModelList.add(new CatModel("https://http.cat/523", "Origin Is Unreachable"));
        catModelList.add(new CatModel("https://http.cat/525", "SSL Handshake Failed"));
        catModelList.add(new CatModel("https://http.cat/599", "Network Connect Timeout Error"));

        return catModelList;
    }
}
