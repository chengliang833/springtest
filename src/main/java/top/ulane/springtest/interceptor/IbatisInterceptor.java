//package top.ulane.springtest.interceptor;
//
//import java.util.Properties;
//
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.Interceptor;
//import org.apache.ibatis.plugin.Intercepts;
//import org.apache.ibatis.plugin.Invocation;
//import org.apache.ibatis.plugin.Plugin;
//import org.apache.ibatis.plugin.Signature;
//import org.apache.ibatis.session.ResultHandler;
//import org.apache.ibatis.session.RowBounds;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@Intercepts( {
//    @Signature( method = "query", type = Executor.class, args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class} ),
//    @Signature( method = "update", type = Executor.class,  args = {MappedStatement.class, Object.class}),
////    @Signature( method = "prepare", type = StatementHandler.class, args = {Connection.class, Integer.class} )
//	})
//public class IbatisInterceptor implements Interceptor{
//	private static final Logger log = LoggerFactory.getLogger(IbatisInterceptor.class);
//
//	@Override
//	public Object intercept(Invocation invocation) throws Throwable {
//		String sql = "";
//		Object[] paramArr = null;
//    	String mName = invocation.getMethod().getName();
//        log.info("mName:"+mName);
//        MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
//        Object parameter = invocation.getArgs()[1];
//        BoundSql boundSql = mappedStatement.getBoundSql(parameter);
//		if ("update".equals(mName)) {
//			sql = boundSql.getSql();
//		} else if ("query".equals(mName)) {
//			sql = boundSql.getSql();
////		} else if ("prepare".equals(mName)) {
//		}
//		log.info("sql:"+sql.replaceAll("[\r\n]*",""));
//
//		Object obj = boundSql.getParameterObject();
//		if(obj != null){
//			log.info("param:"+obj.toString());
//		}
//
//		Object result = invocation.proceed();
//
//		log.info("finish...");
//		return result;
//	}
//	
//	@Override
//	public Object plugin(Object target) {
//		//全部Excutor走代理
////		if (target instanceof CachingExecutor) {
////            Executor a = (Executor) target;
//            return Plugin.wrap(target, this);
////        } else {
////            return target;
////        }
//	}
//
//	@Override
//	public void setProperties(Properties properties) {
//	}
//
////	private Object[] getParams(Object parameter, BoundSql boundSql, MappedStatement ms) {
////		Map<Object, Object> parameterMap = new org.springframework.cglib.beans.BeanMap(parameter);
//////		System.out.println("BeanMap:"+parameterMap.toString());
////		List<ParameterMapping> parameterMappings = boundSql.getParameterMappings();
////		if (parameterMappings != null) {
////			Object[] parameterArray = new Object[parameterMappings.size()];
////			ParameterMapping parameterMapping = null;
////			Object value = null;
////			Object parameterObject = null;
////			PropertyTokenizer prop = null;
////			String propertyName = null;
////			String[] names = null;
////			for (int i = 0; i < parameterMappings.size(); i++) {
////				parameterMapping = parameterMappings.get(i);
////				if (parameterMapping.getMode() != ParameterMode.OUT) {
////					propertyName = parameterMapping.getProperty();
//////					names = propertyName.split("\\.");
//////					if (propertyName.indexOf(".") != -1 && names.length == 2) {
//////						parameterObject = parameterMap.get(names[0]);
//////						propertyName = names[1];
//////					} else if (propertyName.indexOf(".") != -1 && names.length == 3) {
//////						parameterObject = parameterMap.get(names[0]); // map
//////						if (parameterObject instanceof Map) {
//////							parameterObject = ((Map) parameterObject).get(names[1]);
//////						}
//////						propertyName = names[2];
//////					} else {
//////						parameterObject = parameterMap.get(propertyName);
//////					}
////					
//////					metaObject = parameter == null ? null : MetaObject.forObject(parameterObject);
////					prop = new PropertyTokenizer(propertyName);
////					if (boundSql.hasAdditionalParameter(propertyName)) {
////						value = boundSql.getAdditionalParameter(propertyName);
////					} else if (propertyName.startsWith(ForEachSqlNode.ITEM_PREFIX) && boundSql.hasAdditionalParameter(prop.getName())) {
////						value = boundSql.getAdditionalParameter(prop.getName());
////						if (value != null) {
////							value = boundSql.getAdditionalParameter(propertyName.substring(prop.getName().length()));
////						}
////					} else {
////						value = boundSql.getAdditionalParameter(propertyName);
////						if(value == null){
////							parameterObject = parameterMap.get(propertyName);
////							if (parameterObject == null) {
////								value = null;
////							} else if (ms.getConfiguration().getTypeHandlerRegistry().hasTypeHandler(parameterObject.getClass())) {
////								value = parameterObject;
////							}
////						}
////					}
////					parameterArray[i] = value;
////					
////				}
//////				System.out.println(propertyName.toString());
//////				if(value != null)
//////					System.out.println(value.toString());
////			}
////			return parameterArray;
////		}
////		return new Object[]{};
////	}
//	
//}
