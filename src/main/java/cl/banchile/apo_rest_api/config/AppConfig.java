package cl.banchile.apo_rest_api.config;

import java.lang.reflect.Parameter;

import org.springframework.stereotype.Component;

import cl.banchile.framework.lib.core.context.ContextInfo;
import cl.banchile.framework.lib.core.context.ContextParser;

@Component
public class AppConfig implements ContextParser{

	@Override
	public boolean canParse(Parameter[] parameters, Object[] args) {
		return false;
	}

	@Override
	public ContextInfo getContextInfo(Parameter[] parameters, Object[] args) {
		return null;
	}

}
