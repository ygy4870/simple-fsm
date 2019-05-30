/*
 * Copyright (c) 2011 duowan.com. 
 * All Rights Reserved.
 * This program is the confidential and proprietary information of 
 * duowan. ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with
 * the terms of the license agreement you entered into with duowan.com.
 */
package org.ygy.common.simplefsm.util;

import com.google.gson.*;
import org.apache.commons.lang.StringUtils;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author pengkairong@yy.com
 * 
 *         2014-3-4 上午10:09:59
 */
public class EduGsonUtils {

    /**
     * 通过JSON字符串生成对象
     * 
     * @param json JSON字符串
     * @param type 返回值的类型
     * @return 如果能够封装为指定对象，则返回该值，否则返回null
     */
    public static <T> T fromJson(String json, Class<?> T) {
        GsonBuilder builder = new GsonBuilder().registerTypeAdapter(Date.class, new UtilDateSerializer())
                .registerTypeAdapter(Calendar.class, new UtilCalendarSerializer())
                .registerTypeAdapter(GregorianCalendar.class, new UtilCalendarSerializer())
                .setDateFormat(DateFormat.LONG).setPrettyPrinting();
        return StringUtils.isNotBlank(json) ? (T) builder.create().fromJson(json, T) : null;
    }

    /**
     * 通过JSON字符串生成对象
     * 
     * @param json JSON字符串
     * @param T 返回值的类型
     * @return 如果能够封装为指定对象，则返回该值，否则返回null
     */
    public static <T> T fromDateFormateJson(String json, Class<?> T) {
        GsonBuilder builder = new GsonBuilder().registerTypeAdapter(Date.class, new UtilDateSerializer())
                .registerTypeAdapter(Calendar.class, new UtilCalendarSerializer())
                .registerTypeAdapter(GregorianCalendar.class, new UtilCalendarSerializer())
                .setDateFormat("yyyy-MM-dd HH:mm:ss").setPrettyPrinting();
        return StringUtils.isNotBlank(json) ? (T) builder.create().fromJson(json, T) : null;
    }
    
    /**
     * 通过JSON字符串生成对象
     * 
     * @param json JSON字符串
     * @param type 返回值的类型
     * @return 如果能够封装为指定对象，则返回该值，否则返回null
     */
    public static Object fromJson(String json, Type type) {
        GsonBuilder builder = new GsonBuilder().registerTypeAdapter(Date.class, new UtilDateSerializer())
                .registerTypeAdapter(Calendar.class, new UtilCalendarSerializer())
                .registerTypeAdapter(GregorianCalendar.class, new UtilCalendarSerializer())
                .setDateFormat(DateFormat.LONG).setPrettyPrinting();
        return StringUtils.isNotBlank(json) ? builder.create().fromJson(json, type) : null;
    }
    /**
     * 通过JSON字符串生成对象
     * 
     * @param json JSON字符串
     * @param type 返回值的类型
     * @return 如果能够封装为指定对象，则返回该值，否则返回null
     */
    public static Object fromDateFormateJson(String json, Type type) {
        GsonBuilder builder = new GsonBuilder().registerTypeAdapter(Date.class, new UtilDateSerializer())
                .registerTypeAdapter(Calendar.class, new UtilCalendarSerializer())
                .registerTypeAdapter(GregorianCalendar.class, new UtilCalendarSerializer())
                .setDateFormat("yyyy-MM-dd HH:mm:ss").setPrettyPrinting();
        return StringUtils.isNotBlank(json) ? builder.create().fromJson(json, type) : null;
    }
    
    /**
     * 通过Object生成JSON
     * 
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        GsonBuilder builder = new GsonBuilder().registerTypeAdapter(Date.class, new DateSerializerUtils())
                .registerTypeAdapter(Date.class, new DateDeserializerUtils()).setDateFormat(DateFormat.LONG);
        return obj == null ? "" : builder.create().toJson(obj);
    }

    public static String toDateFormatJson(Object obj) {
        GsonBuilder builder = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss");
        return obj == null ? "" : builder.create().toJson(obj);
    }

    private static class UtilDateSerializer implements JsonSerializer<Date>, JsonDeserializer<Date> {
        @Override
        public JsonElement serialize(Date date, Type type, JsonSerializationContext context) {
            return new JsonPrimitive(date.getTime());
        }

        @Override
        public Date deserialize(JsonElement element, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            return new Date(element.getAsJsonPrimitive().getAsLong());
        }
    }

    private static class UtilCalendarSerializer implements JsonSerializer<Calendar>, JsonDeserializer<Calendar> {
        @Override
        public JsonElement serialize(Calendar cal, Type type, JsonSerializationContext context) {
            return new JsonPrimitive(Long.valueOf(cal.getTimeInMillis()));
        }

        @Override
        public Calendar deserialize(JsonElement element, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            Calendar cal = Calendar.getInstance();
            cal.setTimeInMillis(element.getAsJsonPrimitive().getAsLong());
            return cal;
        }

    }
    
    public static void main(String[] args) throws ParseException {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String date = sdf.format(new Date(1452079380000L));
    	System.out.println(date);
    	
    	  //Date或者String转化为时间戳
        SimpleDateFormat format =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time="2016-01-06 19:23:00";
        Date date2 = format.parse(time);
        System.out.print("Format To times:"+date2.getTime());
   
	}

    public static boolean validate(String jsonStr) {
        JsonElement jsonElement;
        try {
            jsonElement = new JsonParser().parse(jsonStr);
        } catch (Exception e) {
            return false;
        }
        if (jsonElement == null) {
            return false;
        }
        if (!jsonElement.isJsonObject()) {
            return false;
        }
        return true;
    }

}
