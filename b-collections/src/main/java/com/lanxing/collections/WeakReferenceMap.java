package com.lanxing.collections;

import javax.jws.soap.SOAPBinding;
import java.lang.ref.WeakReference;

public class WeakReferenceMap {
    public static void main(String[] args) {
        WeakReference<String> reference=new WeakReference<String>("hhh");
        reference.enqueue();
    }
}
