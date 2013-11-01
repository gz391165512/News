package model.Role;

/**
 * Created with IntelliJ IDEA.
 * User: 段昶
 * Date: 13-11-1
 * Time: 上午11:11
 * To change this template use File | Settings | File Templates.
 */

/**
 *
 */
public class Function {
            private int functionId;
            private int functionCode;
            private String functionName;

    public int getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(int functionCode) {
        this.functionCode = functionCode;
    }

    public int getFunctionId() {
        return functionId;
    }

    public void setFunctionId(int functionId) {
        this.functionId = functionId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
