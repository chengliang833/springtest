//package top.ulane.springtest.config;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.http.MediaType;
//import org.springframework.http.converter.HttpMessageConverter;
//import org.springframework.stereotype.Component;
//
//import com.alibaba.fastjson.serializer.SerializeConfig;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//
////@Configuration
//@Component
//public class FastJsonMvcConfigFactory {
// 
////    @Bean(name="fastJsonConverter")
//    public HttpMessageConverter fastJsonHttpMessageConverters() {
//        //1.定义一个convert消息转换对象
//        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//        //2.添加fastJson的序列化配置信息
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
////        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat,
////                SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.WriteMapNullValue,
////                SerializerFeature.WriteNullStringAsEmpty, SerializerFeature.WriteNullListAsEmpty);
//        fastJsonConfig.setSerializeConfig(new SerializeConfig(true));
//        //3.处理中文乱码问题
//        List<MediaType> fastMediaTypes = new ArrayList<>();
//        fastMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//        //4.在convert中添加配置信息
//        fastJsonHttpMessageConverter.setSupportedMediaTypes(fastMediaTypes);
//        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
////        System.out.println("in...");
//        return fastJsonHttpMessageConverter;
//    }
//}
