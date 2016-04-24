package common.util;

import javax.inject.Inject;

import common.util.interfaces.ILogger;

public class Logger implements ILogger {
	private org.slf4j.Logger logger;

	@Inject
	public Logger() {

	}

	@SuppressWarnings("rawtypes")
	public ILogger initialize(Class context) {
		logger = org.slf4j.LoggerFactory.getLogger(context);
		return this;
	}

	@Override
	public void LogInfo(String method, String message, Object... arguments) {
		logger.info(format(method, message), arguments);
	}

	@Override
	public void LogWarning(String method, String message, Object... arguments) {
		logger.warn(format(method, message), arguments);
	}

	@Override
	public void LogDebug(String method, String message, Object... arguments) {
		logger.debug(format(method, message), arguments);
	}

	@Override
	public void LogError(String method, String message, Object... arguments) {
		logger.error(format(method, message), arguments);
	}

	@Override
	public void LogTrace(String method, String message, Object... arguments) {
		logger.trace(format(method, message), arguments);
	}

	private String format(String method, String message) {
		return method + ": " + message;
	}
}
