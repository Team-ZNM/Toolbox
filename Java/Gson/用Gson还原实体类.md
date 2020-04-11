# JAVA -> Gson
## 用Gson还原实体类
#
#### 代码
```java
public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("1","红富士","1",1000,"4",1));
        apples.add(new Apple("2","帝王果","2",2000,"4",3));
        apples.add(new Apple("2","秦冠","3",3000,"4",1));
        apples.add(new Apple("4","姬娜","4",4000,"4",5));
        //将数据塞到map
        Map<String,Object> map = new HashMap<>();
        map.put("applelist",apples);
        toEntity2(map);
    }

    /**
     * 一步
     * 
     */
    public static void toEntity1(Map map){
        Object object = map.get("applelist");
        List<Apple> applelist = new Gson().fromJson(new Gson().toJson(object), new TypeToken<List<Apple>>(){}.getType());
        //循环打印
        applelist.forEach(System.out ::println);
    }
    /**
     * 分步
     * 
     */
    public static void toEntity2(Map map){
        Object object = map.get("applelist");
        String str = new Gson().toJson(object);
        Type typeObj=new TypeToken<List<Apple>>(){}.getType();
        List<Apple> applelist = new Gson().fromJson(str,typeObj);
        //循环打印
        applelist.forEach(System.out ::println);
    }
```