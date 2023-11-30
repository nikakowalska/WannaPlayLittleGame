package Adnotations;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Collections;

public class MinimumListSizeHandler {
    public boolean isValidList(Object o) {
        //paradygmat obiektowy
        Field[] fields = o.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (f.isAnnotationPresent(MinimumListSize.class)) {
                MinimumListSize minimumListSize = f.getAnnotation(MinimumListSize.class);
                int expectedValue = minimumListSize.min();
                Collection<?> list;
                try {
                    list = (Collection<?>) f.get(o);//daj mi pole z obiektu
                } catch (Exception ex) {
                    return false;
                }
                if (expectedValue != list.size()) {
                    return false;
                }
            }
        }
        return true;
    }
}
