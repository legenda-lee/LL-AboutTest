package com.legenda.lee.studytest.aboutMath;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author: Legenda-Lee(lee.legenda@gmail.com)
 * @date: 2020-07-25 22:05
 * @description: List集合的排序题目
 */
public class TestListSort {

    // private static T t = new T("hello", true);

    public static void main(String[] args) {
        // System.out.println(t.getSortField());
        // 时间消耗了有点多我就没测试了，，，正确性与否不可而知，，，

        List<User> users = new ArrayList<>();
        User user1 = new User(3, "Lee");
        User user2 = new User(5, "Aee");
        users.add(user1);
        users.add(user2);

        System.out.println("before,,,");
        for (User user : users) {
            System.out.println(user);
        }

        sortListByField(users, "getName", true);

        System.out.println("after,,,");
        for (User user : users) {
            System.out.println(user);
        }


    }

    static class User {
        private int age;
        private String name;

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 对任意集合的排序方法
     * @param targetList 要排序的实体类List集合
     * @param sortField  排序字段
     * @param sortMode   true正序，false逆序
     */
    public static <T> void sortListByField(List<T> targetList, final String sortField, final boolean sortMode) {

        // Collections.sort(targetList,new T(sortField, sortMode));

        Collections.sort(targetList, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int compareResult = 0;
                try {
                    Method before = ((T)o1).getClass().getMethod(sortField, null);
                    Method after = ((T)o2).getClass().getMethod(sortField, null);

                    // true正序，就是升序
                    if (sortMode) {
                        compareResult = before.invoke(((T)o1), null).toString().compareTo(
                                after.invoke(((T)o2), null).toString());
                    } else {
                        // 降序
                        compareResult = after.invoke(((T)o2), null).toString().compareTo(
                                before.invoke(((T)o1), null).toString());
                    }
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }

                return compareResult;
            }
        });
    }
}


class T implements Comparator {

    private String sortField;
    private boolean sortMode;

    public String getSortField() {
        return sortField;
    }

    public boolean getSortMode() {
        return sortMode;
    }

    public T(String sortField, boolean sortMode) {
        this.sortField = sortField;
        this.sortMode = sortMode;
    }

    @Override
    public int compare(Object o1, Object o2) {
        int compareResult = 0;
        try {
            Method before = ((T)o1).getClass().getMethod(sortField, null);
            Method after = ((T)o2).getClass().getMethod(sortField, null);

            // true正序，就是升序
            if (sortMode) {
                compareResult = before.invoke(((T)o1), null).toString().compareTo(
                        after.invoke(((T)o2), null).toString());
            } else {
                // 降序
                compareResult = after.invoke(((T)o2), null).toString().compareTo(
                        before.invoke(((T)o1), null).toString());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return compareResult;
    }

}

//
// 1. 构建一个本地缓存，缓存的对象是用户ID以及部分用户的信息，在从缓存中获取数据时，如果发现缓存上次更新时间超过30分钟，则需要自动更新一次缓存。
//
// 2. 现在有大量文本文件（100+），预计一共涉及单词数量1W左右。需要由5个线程并发计算，全部计算后做结果合并，选出出现频率最高的100个单词及对应次数。
//
// 3. 两批数据集，一批是userId和用户注册时间，一批是userId和购买商品的交易ID等交易记录，均分布存储在100台计算器中，使用何种方式，可以将数据组装为此类数据集：(userId,注册时间,交易ID)
// 如果userId的购买商品的记录中，有少量特殊的userId，这些userId有大量的购买记录（单机无法承受单个用户的所有购买记录）。
// 核心问题是数据分片，对非热点数据，直接按照userId%100分片；对热点数据，使用userId + 交易ID，假设购买记录时间均匀分布，可以按交易ID range分布，方便查询