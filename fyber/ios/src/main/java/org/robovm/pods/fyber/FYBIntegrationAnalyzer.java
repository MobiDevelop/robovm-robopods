package org.robovm.pods.fyber;

import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;


@NativeClass
public class FYBIntegrationAnalyzer extends NSObject {

//    /**
//     * Gather information about the integration of the FyberSDK and the mediated networks, calling a handler upon completion.
//     *
//     * @discussion If the analysis completes successfully, the report parameter of the completion handler block contains information about the SDK and mediated networks, and the error parameter is nil. If the analysis fails, the report parameter is nil and the error parameter contains information about the failure. The possible error codes are defined in FYBIntegrationAnalyzerErrorReason.
//     *
//     * @param completionHandler A block object to be executed after the analysis has been completed. This handler is executed on the main queue.
//     * The block has no return value and takes two arguments: an FYBIntegrationReport object encapsulating the result of the analysis and an error object describing the failure that occurred during the analysis.
//     */
//    + (void)analyzeWithCompletionHandler:(nonnull void (^)(FYBIntegrationReport * _Nullable report, NSError * _Nullable error))completionHandler;

    public interface CompletionHandler {
        void invoke(FYBIntegrationReport report, NSError error);
    }

    @Method(selector = "analyzeWithCompletionHandler:")
    public native static void analyze(@Block CompletionHandler handler);
}
