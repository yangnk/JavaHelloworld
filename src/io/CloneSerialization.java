//package io;
//
//import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
//
//import java.io.*;
//
///**
// * ${DESCRIPTION}
// *
// * @author yangningkai
// * @create 2018-11-10 下午9:09
// **/
//public class CloneSerialization implements Cloneable, Serializable{
//    @Override
//    public Object clone() {
//        //写进去
//        ObjectOutput objectOutput = null;
//        ByteArrayOutputStream byteArrayOutputStream = null;
//        try {
//            byteArrayOutputStream = new ByteArrayOutputStream();
//            objectOutput = new ObjectOutputStream(byteArrayOutputStream);
//            objectOutput.writeObject(this);
//        } catch (IOException e) {
//            System.out.println("写进入了");
//            e.printStackTrace();
//        }
//        //读出来
//        try {
//            ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
//            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream1);
//            Object o = objectInputStream.readObject();
//            return o;
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//}
