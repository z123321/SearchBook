package com.fastsees.updategoodsprice.javabeans;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@lombok.NoArgsConstructor
@lombok.Data
public class GoodsList {
    @Override
    public String toString() {
        return "GoodsList{" +
                "status=" + status +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", errType=" + errType +
                ", other=" + other +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public DataDTO getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public Integer getErrType() {
        return errType;
    }

    public OtherDTO getOther() {
        return other;
    }

    /**
     * status : 1
     * data : {"itemList":[{"area":"6008003000","isrelatedisbn":"1","imgurl":"sw/kfzimg/1374/01030fd12af54155d7_s.jpg","quality":"85","catid":"6001002000000000","yearsgroup":"1","years":"2000年代 (2000-2009)","years2":"1002000000","pubdate":"2009","price":"405.00","press":"Cambridge University Press 2009","author":"Rajeev S. Patke","importantdesc":"","itemname":"The Long Poems Of Wallace Stevens: An Interpretative Study","userid":"11346640","class":"3","binding":"2","shopid":"367799","shopname":"洄澜书店","nickname":"洄澜君","biztype":"1","itemid":"1991902998","params":{"ems":"","paper":"","binding":2,"edition":"","express":"","pageNum":"","wordNum":"","language":"","logistics":"","sizeWidth":"","printTimes":"","sizeLength":"","noLogistics":"","printingNum":"","publishedIn":"","printingTime":"0000-00-00","registerPost":"","generalParcel":"","expressParcels":"","postalBusiness":"","registeredLetter":""},"promise":"0","itemname_snippet":"The Long Poems Of Wallace Stevens: An Interpretative Study","author_snippet":"Rajeev S. Patke","press_snippet":"Cambridge University Press 2009","importantdesc_snippet":"","updatetime":"2020-11-03","addtime":"2020-05-16","isbn":"9780521115131","_score":"23.989492","weight_score":"11.512945464770231","rank":"1681","hasImg":1,"search_order":0,"months":378,"approach":"1","shopweight":"30","order":1,"newrank":1681,"areaname":"福建省厦门市","appaddtime":"2020-05-16 10:08","newaddtime":"2020-05-16 10:08:28","qualityname":"八五品","bindingname":"平装","zl":[{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"},{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}],"zl1":[{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"}],"zl2":[{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}],"bigimgurl":"https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_n.jpg","smallimgurl":"https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_s.jpg"}],"requestSign":"eyJzdGVyZW90eXBlIjoiMjAifQ=="}
     * message :
     * errType : 0
     * other : {"total":"1","total_found":"1","curpage":"1","page_count":1,"isMinScore":false,"display_isbn":0}
     */

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("data")
    private DataDTO data;
    @JsonProperty("message")
    private String message;
    @JsonProperty("errType")
    private Integer errType;
    @JsonProperty("other")
    private OtherDTO other;

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class DataDTO {
        /**
         * itemList : [{"area":"6008003000","isrelatedisbn":"1","imgurl":"sw/kfzimg/1374/01030fd12af54155d7_s.jpg","quality":"85","catid":"6001002000000000","yearsgroup":"1","years":"2000年代 (2000-2009)","years2":"1002000000","pubdate":"2009","price":"405.00","press":"Cambridge University Press 2009","author":"Rajeev S. Patke","importantdesc":"","itemname":"The Long Poems Of Wallace Stevens: An Interpretative Study","userid":"11346640","class":"3","binding":"2","shopid":"367799","shopname":"洄澜书店","nickname":"洄澜君","biztype":"1","itemid":"1991902998","params":{"ems":"","paper":"","binding":2,"edition":"","express":"","pageNum":"","wordNum":"","language":"","logistics":"","sizeWidth":"","printTimes":"","sizeLength":"","noLogistics":"","printingNum":"","publishedIn":"","printingTime":"0000-00-00","registerPost":"","generalParcel":"","expressParcels":"","postalBusiness":"","registeredLetter":""},"promise":"0","itemname_snippet":"The Long Poems Of Wallace Stevens: An Interpretative Study","author_snippet":"Rajeev S. Patke","press_snippet":"Cambridge University Press 2009","importantdesc_snippet":"","updatetime":"2020-11-03","addtime":"2020-05-16","isbn":"9780521115131","_score":"23.989492","weight_score":"11.512945464770231","rank":"1681","hasImg":1,"search_order":0,"months":378,"approach":"1","shopweight":"30","order":1,"newrank":1681,"areaname":"福建省厦门市","appaddtime":"2020-05-16 10:08","newaddtime":"2020-05-16 10:08:28","qualityname":"八五品","bindingname":"平装","zl":[{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"},{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}],"zl1":[{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"}],"zl2":[{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}],"bigimgurl":"https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_n.jpg","smallimgurl":"https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_s.jpg"}]
         * requestSign : eyJzdGVyZW90eXBlIjoiMjAifQ==
         */

        @JsonProperty("requestSign")
        private String requestSign;
        @JsonProperty("itemList")
        private List<ItemListDTO> itemList;

        public String getRequestSign() {
            return requestSign;
        }

        public List<ItemListDTO> getItemList() {
            return itemList;
        }

        @lombok.NoArgsConstructor
        @lombok.Data
        public static class ItemListDTO {
            @Override
            public String toString() {
                return "ItemListDTO{" +
                        "area='" + area + '\'' +
                        ", isrelatedisbn='" + isrelatedisbn + '\'' +
                        ", imgurl='" + imgurl + '\'' +
                        ", quality='" + quality + '\'' +
                        ", catid='" + catid + '\'' +
                        ", yearsgroup='" + yearsgroup + '\'' +
                        ", years='" + years + '\'' +
                        ", years2='" + years2 + '\'' +
                        ", pubdate='" + pubdate + '\'' +
                        ", price='" + price + '\'' +
                        ", press='" + press + '\'' +
                        ", author='" + author + '\'' +
                        ", importantdesc='" + importantdesc + '\'' +
                        ", itemname='" + itemname + '\'' +
                        ", userid='" + userid + '\'' +
                        ", classX='" + classX + '\'' +
                        ", binding='" + binding + '\'' +
                        ", shopid='" + shopid + '\'' +
                        ", shopname='" + shopname + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", biztype='" + biztype + '\'' +
                        ", itemid='" + itemid + '\'' +
                        ", params=" + params +
                        ", promise='" + promise + '\'' +
                        ", itemnameSnippet='" + itemnameSnippet + '\'' +
                        ", authorSnippet='" + authorSnippet + '\'' +
                        ", pressSnippet='" + pressSnippet + '\'' +
                        ", importantdescSnippet='" + importantdescSnippet + '\'' +
                        ", updatetime='" + updatetime + '\'' +
                        ", addtime='" + addtime + '\'' +
                        ", isbn='" + isbn + '\'' +
                        ", score='" + score + '\'' +
                        ", weightScore='" + weightScore + '\'' +
                        ", rank='" + rank + '\'' +
                        ", hasImg=" + hasImg +
                        ", searchOrder=" + searchOrder +
                        ", months=" + months +
                        ", approach='" + approach + '\'' +
                        ", shopweight='" + shopweight + '\'' +
                        ", order=" + order +
                        ", newrank=" + newrank +
                        ", areaname='" + areaname + '\'' +
                        ", appaddtime='" + appaddtime + '\'' +
                        ", newaddtime='" + newaddtime + '\'' +
                        ", qualityname='" + qualityname + '\'' +
                        ", bindingname='" + bindingname + '\'' +
                        ", bigimgurl='" + bigimgurl + '\'' +
                        ", smallimgurl='" + smallimgurl + '\'' +
                        ", zl=" + zl +
                        ", zl1=" + zl1 +
                        ", zl2=" + zl2 +
                        '}';
            }

            public String getArea() {
                return area;
            }

            public String getIsrelatedisbn() {
                return isrelatedisbn;
            }

            public String getImgurl() {
                return imgurl;
            }

            public String getQuality() {
                return quality;
            }

            public String getCatid() {
                return catid;
            }

            public String getYearsgroup() {
                return yearsgroup;
            }

            public String getYears() {
                return years;
            }

            public String getYears2() {
                return years2;
            }

            public String getPubdate() {
                return pubdate;
            }

            public String getPrice() {
                return price;
            }

            public String getPress() {
                return press;
            }

            public String getAuthor() {
                return author;
            }

            public String getImportantdesc() {
                return importantdesc;
            }

            public String getItemname() {
                return itemname;
            }

            public String getUserid() {
                return userid;
            }

            public String getClassX() {
                return classX;
            }

            public String getBinding() {
                return binding;
            }

            public String getShopid() {
                return shopid;
            }

            public String getShopname() {
                return shopname;
            }

            public String getNickname() {
                return nickname;
            }

            public String getBiztype() {
                return biztype;
            }

            public String getItemid() {
                return itemid;
            }

            public ParamsDTO getParams() {
                return params;
            }

            public String getPromise() {
                return promise;
            }

            public String getItemnameSnippet() {
                return itemnameSnippet;
            }

            public String getAuthorSnippet() {
                return authorSnippet;
            }

            public String getPressSnippet() {
                return pressSnippet;
            }

            public String getImportantdescSnippet() {
                return importantdescSnippet;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public String getAddtime() {
                return addtime;
            }

            public String getIsbn() {
                return isbn;
            }

            public String getScore() {
                return score;
            }

            public String getWeightScore() {
                return weightScore;
            }

            public String getRank() {
                return rank;
            }

            public Integer getHasImg() {
                return hasImg;
            }

            public Integer getSearchOrder() {
                return searchOrder;
            }

            public Integer getMonths() {
                return months;
            }

            public String getApproach() {
                return approach;
            }

            public String getShopweight() {
                return shopweight;
            }

            public Integer getOrder() {
                return order;
            }

            public Integer getNewrank() {
                return newrank;
            }

            public String getAreaname() {
                return areaname;
            }

            public String getAppaddtime() {
                return appaddtime;
            }

            public String getNewaddtime() {
                return newaddtime;
            }

            public String getQualityname() {
                return qualityname;
            }

            public String getBindingname() {
                return bindingname;
            }

            public String getBigimgurl() {
                return bigimgurl;
            }

            public String getSmallimgurl() {
                return smallimgurl;
            }

            public List<ZlDTO> getZl() {
                return zl;
            }

            public List<Zl1DTO> getZl1() {
                return zl1;
            }

            public List<Zl2DTO> getZl2() {
                return zl2;
            }

            /**
             * area : 6008003000
             * isrelatedisbn : 1
             * imgurl : sw/kfzimg/1374/01030fd12af54155d7_s.jpg
             * quality : 85
             * catid : 6001002000000000
             * yearsgroup : 1
             * years : 2000年代 (2000-2009)
             * years2 : 1002000000
             * pubdate : 2009
             * price : 405.00
             * press : Cambridge University Press 2009
             * author : Rajeev S. Patke
             * importantdesc :
             * itemname : The Long Poems Of Wallace Stevens: An Interpretative Study
             * userid : 11346640
             * class : 3
             * binding : 2
             * shopid : 367799
             * shopname : 洄澜书店
             * nickname : 洄澜君
             * biztype : 1
             * itemid : 1991902998
             * params : {"ems":"","paper":"","binding":2,"edition":"","express":"","pageNum":"","wordNum":"","language":"","logistics":"","sizeWidth":"","printTimes":"","sizeLength":"","noLogistics":"","printingNum":"","publishedIn":"","printingTime":"0000-00-00","registerPost":"","generalParcel":"","expressParcels":"","postalBusiness":"","registeredLetter":""}
             * promise : 0
             * itemname_snippet : The Long Poems Of Wallace Stevens: An Interpretative Study
             * author_snippet : Rajeev S. Patke
             * press_snippet : Cambridge University Press 2009
             * importantdesc_snippet :
             * updatetime : 2020-11-03
             * addtime : 2020-05-16
             * isbn : 9780521115131
             * _score : 23.989492
             * weight_score : 11.512945464770231
             * rank : 1681
             * hasImg : 1
             * search_order : 0
             * months : 378
             * approach : 1
             * shopweight : 30
             * order : 1
             * newrank : 1681
             * areaname : 福建省厦门市
             * appaddtime : 2020-05-16 10:08
             * newaddtime : 2020-05-16 10:08:28
             * qualityname : 八五品
             * bindingname : 平装
             * zl : [{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"},{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}]
             * zl1 : [{"name":"作者","value":"Rajeev S. Patke"},{"name":"出版社","value":"Cambridge University Press 2009"}]
             * zl2 : [{"name":"出版时间","value":"2009"},{"name":"装帧","value":"平装"}]
             * bigimgurl : https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_n.jpg
             * smallimgurl : https://www.kfzimg.com/sw/kfzimg/1374/01030fd12af54155d7_s.jpg
             */

            @JsonProperty("area")
            private String area;
            @JsonProperty("isrelatedisbn")
            private String isrelatedisbn;
            @JsonProperty("imgurl")
            private String imgurl;
            @JsonProperty("quality")
            private String quality;
            @JsonProperty("catid")
            private String catid;
            @JsonProperty("yearsgroup")
            private String yearsgroup;
            @JsonProperty("years")
            private String years;
            @JsonProperty("years2")
            private String years2;
            @JsonProperty("pubdate")
            private String pubdate;
            @JsonProperty("price")
            private String price;
            @JsonProperty("press")
            private String press;
            @JsonProperty("author")
            private String author;
            @JsonProperty("importantdesc")
            private String importantdesc;
            @JsonProperty("itemname")
            private String itemname;
            @JsonProperty("userid")
            private String userid;
            @JsonProperty("class")
            private String classX;
            @JsonProperty("binding")
            private String binding;
            @JsonProperty("shopid")
            private String shopid;
            @JsonProperty("shopname")
            private String shopname;
            @JsonProperty("nickname")
            private String nickname;
            @JsonProperty("biztype")
            private String biztype;
            @JsonProperty("itemid")
            private String itemid;
            @JsonProperty("params")
            private ParamsDTO params;
            @JsonProperty("promise")
            private String promise;
            @JsonProperty("itemname_snippet")
            private String itemnameSnippet;
            @JsonProperty("author_snippet")
            private String authorSnippet;
            @JsonProperty("press_snippet")
            private String pressSnippet;
            @JsonProperty("importantdesc_snippet")
            private String importantdescSnippet;
            @JsonProperty("updatetime")
            private String updatetime;
            @JsonProperty("addtime")
            private String addtime;
            @JsonProperty("isbn")
            private String isbn;
            @JsonProperty("_score")
            private String score;
            @JsonProperty("weight_score")
            private String weightScore;
            @JsonProperty("rank")
            private String rank;
            @JsonProperty("hasImg")
            private Integer hasImg;
            @JsonProperty("search_order")
            private Integer searchOrder;
            @JsonProperty("months")
            private Integer months;
            @JsonProperty("approach")
            private String approach;
            @JsonProperty("shopweight")
            private String shopweight;
            @JsonProperty("order")
            private Integer order;
            @JsonProperty("newrank")
            private Integer newrank;
            @JsonProperty("areaname")
            private String areaname;
            @JsonProperty("appaddtime")
            private String appaddtime;
            @JsonProperty("newaddtime")
            private String newaddtime;
            @JsonProperty("qualityname")
            private String qualityname;
            @JsonProperty("bindingname")
            private String bindingname;
            @JsonProperty("bigimgurl")
            private String bigimgurl;
            @JsonProperty("smallimgurl")
            private String smallimgurl;
            @JsonProperty("zl")
            private List<ZlDTO> zl;
            @JsonProperty("zl1")
            private List<Zl1DTO> zl1;
            @JsonProperty("zl2")
            private List<Zl2DTO> zl2;

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class ParamsDTO {
                /**
                 * ems :
                 * paper :
                 * binding : 2
                 * edition :
                 * express :
                 * pageNum :
                 * wordNum :
                 * language :
                 * logistics :
                 * sizeWidth :
                 * printTimes :
                 * sizeLength :
                 * noLogistics :
                 * printingNum :
                 * publishedIn :
                 * printingTime : 0000-00-00
                 * registerPost :
                 * generalParcel :
                 * expressParcels :
                 * postalBusiness :
                 * registeredLetter :
                 */

                @JsonProperty("ems")
                private String ems;
                @JsonProperty("paper")
                private String paper;
                @JsonProperty("binding")
                private Integer binding;
                @JsonProperty("edition")
                private String edition;
                @JsonProperty("express")
                private String express;
                @JsonProperty("pageNum")
                private String pageNum;
                @JsonProperty("wordNum")
                private String wordNum;
                @JsonProperty("language")
                private String language;
                @JsonProperty("logistics")
                private String logistics;
                @JsonProperty("sizeWidth")
                private String sizeWidth;
                @JsonProperty("printTimes")
                private String printTimes;
                @JsonProperty("sizeLength")
                private String sizeLength;
                @JsonProperty("noLogistics")
                private String noLogistics;
                @JsonProperty("printingNum")
                private String printingNum;
                @JsonProperty("publishedIn")
                private String publishedIn;
                @JsonProperty("printingTime")
                private String printingTime;
                @JsonProperty("registerPost")
                private String registerPost;
                @JsonProperty("generalParcel")
                private String generalParcel;
                @JsonProperty("expressParcels")
                private String expressParcels;
                @JsonProperty("postalBusiness")
                private String postalBusiness;
                @JsonProperty("registeredLetter")
                private String registeredLetter;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class ZlDTO {
                /**
                 * name : 作者
                 * value : Rajeev S. Patke
                 */

                @JsonProperty("name")
                private String name;
                @JsonProperty("value")
                private String value;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class Zl1DTO {
                /**
                 * name : 作者
                 * value : Rajeev S. Patke
                 */

                @JsonProperty("name")
                private String name;
                @JsonProperty("value")
                private String value;
            }

            @lombok.NoArgsConstructor
            @lombok.Data
            public static class Zl2DTO {
                /**
                 * name : 出版时间
                 * value : 2009
                 */

                @JsonProperty("name")
                private String name;
                @JsonProperty("value")
                private String value;
            }
        }
    }

    @lombok.NoArgsConstructor
    @lombok.Data
    public static class OtherDTO {
        @Override
        public String toString() {
            return "OtherDTO{" +
                    "total='" + total + '\'' +
                    ", totalFound='" + totalFound + '\'' +
                    ", curpage='" + curpage + '\'' +
                    ", pageCount=" + pageCount +
                    ", isMinScore=" + isMinScore +
                    ", displayIsbn=" + displayIsbn +
                    '}';
        }

        /**
         * total : 1
         * total_found : 1
         * curpage : 1
         * page_count : 1
         * isMinScore : false
         * display_isbn : 0
         */

        @JsonProperty("total")
        private String total;
        @JsonProperty("total_found")
        private String totalFound;
        @JsonProperty("curpage")
        private String curpage;
        @JsonProperty("page_count")
        private Integer pageCount;
        @JsonProperty("isMinScore")
        private Boolean isMinScore;
        @JsonProperty("display_isbn")
        private Integer displayIsbn;
    }
}
