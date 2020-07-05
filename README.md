# Design Patterns

> 设计模式练习代码

## 1. 工厂模式


## 2. 适配器模式
1. 实例代码
```java
    public class Services {
        private Services(){}
    
        /**
         * provider注册服务集合
         */
        private static final Map<String, Provider> PROVIDER_MAP = new ConcurrentHashMap<>();
        public static final String DEFAULT = "default";
        static {
            PROVIDER_MAP.put(DEFAULT, new ProviderImpl());
        }
    
        /**
         * 通过静态方法名明确语义
         * @return service
         */
        public static Service newInstance(){
            return newInstance(DEFAULT);
        }
        public static Service newInstance(String key){
            Provider provider = PROVIDER_MAP.get(key);
            return provider.newService();
        }
    
        /**
         * 静态内部实现类, 对外屏蔽
         */
        private static class ServiceImpl implements Service {
            @Override
            public void doService() {
                System.out.println("执行任务");
            }
        }
        private static class ProviderImpl implements Provider {
            @Override
            public Service newService() {
                return new ServiceImpl();
            }
        }
    
        /**
         * 测试代码
         */
        public static void main(String[] args) {
            Service service = Services.newInstance();
            service.doService();
        }
    }
```
