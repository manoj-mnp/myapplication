package com.abhimantech.hiree.hireelocal;

import java.io.IOException;
import java.net.CookieManager;
import java.net.URI;
import java.util.List;
import java.util.Map;

/**
 * Created by manoj on 19/07/15.
 */
class MyCookieManager extends CookieManager {

    @Override
    public void put(URI uri, Map<String, List<String>> stringListMap) throws IOException {
        super.put(uri, stringListMap);
        if (stringListMap != null && stringListMap.get("Set-Cookie") != null)
            for (String string : stringListMap.get("Set-Cookie")) {
            }
    }
}
