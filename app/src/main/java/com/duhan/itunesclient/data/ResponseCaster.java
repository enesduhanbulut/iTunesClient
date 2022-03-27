package com.duhan.itunesclient.data;

public final class ResponseCaster {
    private AbstractResult abstractResult;
    private String wrapper;
    public ResponseCaster(AbstractResult abstractResult) {
        this.abstractResult = abstractResult;
        this.wrapper = abstractResult.wrapperType;
    }


}
