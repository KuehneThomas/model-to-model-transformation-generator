package common.util.interfaces;

public interface ILogger {
	@SuppressWarnings("rawtypes")
	ILogger initialize(Class context);
	void LogInfo(String method, String message, Object... arguments);
	void LogWarning(String method, String message, Object... arguments);
	void LogDebug(String method, String message, Object... arguments);
	void LogError(String method, String message, Object... arguments);
	void LogTrace(String method, String message, Object... arguments);
}
