package com.cpmx6.devf.cpmx6.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by hugo on 7/19/15.
 */
public class DetailItem {

    /**
     * data : {"caption":"","trending_datetime":"2014-11-12 06:22:52","type":"gif","url":"http://giphy.com/gifs/eyes-shocked-bird-feqkVgjJpYtjy","content_url":"","id":"feqkVgjJpYtjy","import_datetime":"2013-03-21 04:03:08","username":"","source":"http://littleanimalgifs.tumblr.com/post/17994517807","embed_url":"http://giphy.com/embed/feqkVgjJpYtjy","images":{"fixed_height":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.webp","height":"200","mp4_size":"27279","width":"445","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.gif","webp_size":"420734","size":"445432"},"fixed_height_small_still":{"height":"100","width":"223","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100_s.gif"},"original_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_small_still":{"height":"45","width":"100","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w_s.gif"},"fixed_width_still":{"height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_s.gif"},"downsized_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.webp","height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.gif","webp_size":"26460","size":"83007"},"fixed_height_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.webp","height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.gif","webp_size":"89516","size":"183225"},"fixed_width":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.webp","height":"90","mp4_size":"31919","width":"200","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.gif","webp_size":"122600","size":"115885"},"fixed_height_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.webp","height":"100","mp4_size":"240476","width":"223","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.gif","webp_size":"129604","size":"445432"},"original":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.webp","height":"150","mp4_size":"97841","frames":"27","width":"334","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","webp_size":"270108","size":"511581"},"fixed_height_still":{"height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_s.gif"},"downsized":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"downsized_large":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"fixed_width_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.webp","height":"45","mp4_size":"79783","width":"100","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.gif","webp_size":"41620","size":"115885"}},"bitly_gif_url":"http://gph.is/XJ200y","bitly_url":"http://gph.is/XJ200y","rating":"g"}
     * meta : {"status":200,"msg":"OK"}
     */
    @SerializedName("data")
    private DataEntity data;
    @SerializedName("meta")
    private MetaEntity meta;

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public DataEntity getData() {
        return data;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public static class DataEntity {
        /**
         * caption :
         * trending_datetime : 2014-11-12 06:22:52
         * type : gif
         * url : http://giphy.com/gifs/eyes-shocked-bird-feqkVgjJpYtjy
         * content_url :
         * id : feqkVgjJpYtjy
         * import_datetime : 2013-03-21 04:03:08
         * username :
         * source : http://littleanimalgifs.tumblr.com/post/17994517807
         * embed_url : http://giphy.com/embed/feqkVgjJpYtjy
         * images : {"fixed_height":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.webp","height":"200","mp4_size":"27279","width":"445","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.gif","webp_size":"420734","size":"445432"},"fixed_height_small_still":{"height":"100","width":"223","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100_s.gif"},"original_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_small_still":{"height":"45","width":"100","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w_s.gif"},"fixed_width_still":{"height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_s.gif"},"downsized_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.webp","height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.gif","webp_size":"26460","size":"83007"},"fixed_height_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.webp","height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.gif","webp_size":"89516","size":"183225"},"fixed_width":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.webp","height":"90","mp4_size":"31919","width":"200","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.gif","webp_size":"122600","size":"115885"},"fixed_height_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.webp","height":"100","mp4_size":"240476","width":"223","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.gif","webp_size":"129604","size":"445432"},"original":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.webp","height":"150","mp4_size":"97841","frames":"27","width":"334","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","webp_size":"270108","size":"511581"},"fixed_height_still":{"height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_s.gif"},"downsized":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"downsized_large":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"fixed_width_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.webp","height":"45","mp4_size":"79783","width":"100","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.gif","webp_size":"41620","size":"115885"}}
         * bitly_gif_url : http://gph.is/XJ200y
         * bitly_url : http://gph.is/XJ200y
         * rating : g
         */
        @SerializedName("caption")
        private String caption;
        @SerializedName("trendingDatetime")
        private String trendingDatetime;
        @SerializedName("type")
        private String type;
        @SerializedName("url")
        private String url;
        @SerializedName("contentUrl")
        private String contentUrl;
        @SerializedName("id")
        private String id;
        @SerializedName("importDatetime")
        private String importDatetime;
        @SerializedName("username")
        private String username;
        @SerializedName("source")
        private String source;
        @SerializedName("embedUrl")
        private String embedUrl;
        @SerializedName("images")
        private ImagesEntity images;
        @SerializedName("bitlyGifUrl")
        private String bitlyGifUrl;
        @SerializedName("bitlyUrl")
        private String bitlyUrl;
        @SerializedName("rating")
        private String rating;

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public void setTrendingDatetime(String trendingDatetime) {
            this.trendingDatetime = trendingDatetime;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setContentUrl(String contentUrl) {
            this.contentUrl = contentUrl;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setImportDatetime(String importDatetime) {
            this.importDatetime = importDatetime;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setEmbedUrl(String embedUrl) {
            this.embedUrl = embedUrl;
        }

        public void setImages(ImagesEntity images) {
            this.images = images;
        }

        public void setBitlyGifUrl(String bitlyGifUrl) {
            this.bitlyGifUrl = bitlyGifUrl;
        }

        public void setBitlyUrl(String bitlyUrl) {
            this.bitlyUrl = bitlyUrl;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getCaption() {
            return caption;
        }

        public String getTrendingDatetime() {
            return trendingDatetime;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getContentUrl() {
            return contentUrl;
        }

        public String getId() {
            return id;
        }

        public String getImportDatetime() {
            return importDatetime;
        }

        public String getUsername() {
            return username;
        }

        public String getSource() {
            return source;
        }

        public String getEmbedUrl() {
            return embedUrl;
        }

        public ImagesEntity getImages() {
            return images;
        }

        public String getBitlyGifUrl() {
            return bitlyGifUrl;
        }

        public String getBitlyUrl() {
            return bitlyUrl;
        }

        public String getRating() {
            return rating;
        }

        public static class ImagesEntity {
            /**
             * fixed_height : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.webp","height":"200","mp4_size":"27279","width":"445","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.gif","webp_size":"420734","size":"445432"}
             * fixed_height_small_still : {"height":"100","width":"223","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100_s.gif"}
             * original_still : {"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"}
             * fixed_width_small_still : {"height":"45","width":"100","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w_s.gif"}
             * fixed_width_still : {"height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_s.gif"}
             * downsized_still : {"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"}
             * fixed_width_downsampled : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.webp","height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.gif","webp_size":"26460","size":"83007"}
             * fixed_height_downsampled : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.webp","height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.gif","webp_size":"89516","size":"183225"}
             * fixed_width : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.webp","height":"90","mp4_size":"31919","width":"200","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.gif","webp_size":"122600","size":"115885"}
             * fixed_height_small : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.webp","height":"100","mp4_size":"240476","width":"223","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.gif","webp_size":"129604","size":"445432"}
             * original : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.webp","height":"150","mp4_size":"97841","frames":"27","width":"334","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","webp_size":"270108","size":"511581"}
             * fixed_height_still : {"height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_s.gif"}
             * downsized : {"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"}
             * downsized_large : {"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"}
             * fixed_width_small : {"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.webp","height":"45","mp4_size":"79783","width":"100","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.gif","webp_size":"41620","size":"115885"}
             */
            @SerializedName("fixedHeight")
            private FixedHeightEntity fixedHeight;
            @SerializedName("fixedHeightSmallStill")
            private FixedHeightSmallStillEntity fixedHeightSmallStill;
            @SerializedName("originalStill")
            private OriginalStillEntity originalStill;
            @SerializedName("fixedWidthSmallStill")
            private FixedWidthSmallStillEntity fixedWidthSmallStill;
            @SerializedName("fixedWidthStill")
            private FixedWidthStillEntity fixedWidthStill;
            @SerializedName("downsizedStill")
            private DownsizedStillEntity downsizedStill;
            @SerializedName("fixedWidthDownsampled")
            private FixedWidthDownsampledEntity fixedWidthDownsampled;
            @SerializedName("fixedHeightDownsampled")
            private FixedHeightDownsampledEntity fixedHeightDownsampled;
            @SerializedName("fixedWidth")
            private FixedWidthEntity fixedWidth;
            @SerializedName("fixedHeightSmall")
            private FixedHeightSmallEntity fixedHeightSmall;
            @SerializedName("original")
            private OriginalEntity original;
            @SerializedName("fixedHeightStill")
            private FixedHeightStillEntity fixedHeightStill;
            @SerializedName("downsized")
            private DownsizedEntity downsized;
            @SerializedName("downsizedLarge")
            private DownsizedLargeEntity downsizedLarge;
            @SerializedName("fixedWidthSmall")
            private FixedWidthSmallEntity fixedWidthSmall;

            public void setFixedHeight(FixedHeightEntity fixedHeight) {
                this.fixedHeight = fixedHeight;
            }

            public void setFixedHeightSmallStill(FixedHeightSmallStillEntity fixedHeightSmallStill) {
                this.fixedHeightSmallStill = fixedHeightSmallStill;
            }

            public void setOriginalStill(OriginalStillEntity originalStill) {
                this.originalStill = originalStill;
            }

            public void setFixedWidthSmallStill(FixedWidthSmallStillEntity fixedWidthSmallStill) {
                this.fixedWidthSmallStill = fixedWidthSmallStill;
            }

            public void setFixedWidthStill(FixedWidthStillEntity fixedWidthStill) {
                this.fixedWidthStill = fixedWidthStill;
            }

            public void setDownsizedStill(DownsizedStillEntity downsizedStill) {
                this.downsizedStill = downsizedStill;
            }

            public void setFixedWidthDownsampled(FixedWidthDownsampledEntity fixedWidthDownsampled) {
                this.fixedWidthDownsampled = fixedWidthDownsampled;
            }

            public void setFixedHeightDownsampled(FixedHeightDownsampledEntity fixedHeightDownsampled) {
                this.fixedHeightDownsampled = fixedHeightDownsampled;
            }

            public void setFixedWidth(FixedWidthEntity fixedWidth) {
                this.fixedWidth = fixedWidth;
            }

            public void setFixedHeightSmall(FixedHeightSmallEntity fixedHeightSmall) {
                this.fixedHeightSmall = fixedHeightSmall;
            }

            public void setOriginal(OriginalEntity original) {
                this.original = original;
            }

            public void setFixedHeightStill(FixedHeightStillEntity fixedHeightStill) {
                this.fixedHeightStill = fixedHeightStill;
            }

            public void setDownsized(DownsizedEntity downsized) {
                this.downsized = downsized;
            }

            public void setDownsizedLarge(DownsizedLargeEntity downsizedLarge) {
                this.downsizedLarge = downsizedLarge;
            }

            public void setFixedWidthSmall(FixedWidthSmallEntity fixedWidthSmall) {
                this.fixedWidthSmall = fixedWidthSmall;
            }

            public FixedHeightEntity getFixedHeight() {
                return fixedHeight;
            }

            public FixedHeightSmallStillEntity getFixedHeightSmallStill() {
                return fixedHeightSmallStill;
            }

            public OriginalStillEntity getOriginalStill() {
                return originalStill;
            }

            public FixedWidthSmallStillEntity getFixedWidthSmallStill() {
                return fixedWidthSmallStill;
            }

            public FixedWidthStillEntity getFixedWidthStill() {
                return fixedWidthStill;
            }

            public DownsizedStillEntity getDownsizedStill() {
                return downsizedStill;
            }

            public FixedWidthDownsampledEntity getFixedWidthDownsampled() {
                return fixedWidthDownsampled;
            }

            public FixedHeightDownsampledEntity getFixedHeightDownsampled() {
                return fixedHeightDownsampled;
            }

            public FixedWidthEntity getFixedWidth() {
                return fixedWidth;
            }

            public FixedHeightSmallEntity getFixedHeightSmall() {
                return fixedHeightSmall;
            }

            public OriginalEntity getOriginal() {
                return original;
            }

            public FixedHeightStillEntity getFixedHeightStill() {
                return fixedHeightStill;
            }

            public DownsizedEntity getDownsized() {
                return downsized;
            }

            public DownsizedLargeEntity getDownsizedLarge() {
                return downsizedLarge;
            }

            public FixedWidthSmallEntity getFixedWidthSmall() {
                return fixedWidthSmall;
            }

            public static class FixedHeightEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/200.webp
                 * height : 200
                 * mp4_size : 27279
                 * width : 445
                 * mp4 : http://media0.giphy.com/media/feqkVgjJpYtjy/200.mp4
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200.gif
                 * webp_size : 420734
                 * size : 445432
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("mp4Size")
                private String mp4Size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4Size(String mp4Size) {
                    this.mp4Size = mp4Size;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getMp4Size() {
                    return mp4Size;
                }

                public String getWidth() {
                    return width;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedHeightSmallStillEntity {
                /**
                 * height : 100
                 * width : 223
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/100_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class OriginalStillEntity {
                /**
                 * height : 150
                 * width : 334
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class FixedWidthSmallStillEntity {
                /**
                 * height : 45
                 * width : 100
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/100w_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class FixedWidthStillEntity {
                /**
                 * height : 90
                 * width : 200
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200w_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class DownsizedStillEntity {
                /**
                 * height : 150
                 * width : 334
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class FixedWidthDownsampledEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.webp
                 * height : 90
                 * width : 200
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.gif
                 * webp_size : 26460
                 * size : 83007
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedHeightDownsampledEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.webp
                 * height : 200
                 * width : 445
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.gif
                 * webp_size : 89516
                 * size : 183225
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedWidthEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/200w.webp
                 * height : 90
                 * mp4_size : 31919
                 * width : 200
                 * mp4 : http://media0.giphy.com/media/feqkVgjJpYtjy/200w.mp4
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200w.gif
                 * webp_size : 122600
                 * size : 115885
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("mp4Size")
                private String mp4Size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4Size(String mp4Size) {
                    this.mp4Size = mp4Size;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getMp4Size() {
                    return mp4Size;
                }

                public String getWidth() {
                    return width;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedHeightSmallEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/100.webp
                 * height : 100
                 * mp4_size : 240476
                 * width : 223
                 * mp4 : http://media0.giphy.com/media/feqkVgjJpYtjy/100.mp4
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/100.gif
                 * webp_size : 129604
                 * size : 445432
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("mp4Size")
                private String mp4Size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4Size(String mp4Size) {
                    this.mp4Size = mp4Size;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getMp4Size() {
                    return mp4Size;
                }

                public String getWidth() {
                    return width;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class OriginalEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.webp
                 * height : 150
                 * mp4_size : 97841
                 * frames : 27
                 * width : 334
                 * mp4 : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.mp4
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif
                 * webp_size : 270108
                 * size : 511581
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("mp4Size")
                private String mp4Size;
                @SerializedName("frames")
                private String frames;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4Size(String mp4Size) {
                    this.mp4Size = mp4Size;
                }

                public void setFrames(String frames) {
                    this.frames = frames;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getMp4Size() {
                    return mp4Size;
                }

                public String getFrames() {
                    return frames;
                }

                public String getWidth() {
                    return width;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedHeightStillEntity {
                /**
                 * height : 200
                 * width : 445
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/200_s.gif
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }
            }

            public static class DownsizedEntity {
                /**
                 * height : 150
                 * width : 334
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif
                 * size : 511581
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;
                @SerializedName("size")
                private String size;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class DownsizedLargeEntity {
                /**
                 * height : 150
                 * width : 334
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif
                 * size : 511581
                 */
                @SerializedName("height")
                private String height;
                @SerializedName("width")
                private String width;
                @SerializedName("url")
                private String url;
                @SerializedName("size")
                private String size;

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getHeight() {
                    return height;
                }

                public String getWidth() {
                    return width;
                }

                public String getUrl() {
                    return url;
                }

                public String getSize() {
                    return size;
                }
            }

            public static class FixedWidthSmallEntity {
                /**
                 * webp : http://media0.giphy.com/media/feqkVgjJpYtjy/100w.webp
                 * height : 45
                 * mp4_size : 79783
                 * width : 100
                 * mp4 : http://media0.giphy.com/media/feqkVgjJpYtjy/100w.mp4
                 * url : http://media0.giphy.com/media/feqkVgjJpYtjy/100w.gif
                 * webp_size : 41620
                 * size : 115885
                 */
                @SerializedName("webp")
                private String webp;
                @SerializedName("height")
                private String height;
                @SerializedName("mp4Size")
                private String mp4Size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webpSize")
                private String webpSize;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4Size(String mp4Size) {
                    this.mp4Size = mp4Size;
                }

                public void setWidth(String width) {
                    this.width = width;
                }

                public void setMp4(String mp4) {
                    this.mp4 = mp4;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public void setWebpSize(String webpSize) {
                    this.webpSize = webpSize;
                }

                public void setSize(String size) {
                    this.size = size;
                }

                public String getWebp() {
                    return webp;
                }

                public String getHeight() {
                    return height;
                }

                public String getMp4Size() {
                    return mp4Size;
                }

                public String getWidth() {
                    return width;
                }

                public String getMp4() {
                    return mp4;
                }

                public String getUrl() {
                    return url;
                }

                public String getWebpSize() {
                    return webpSize;
                }

                public String getSize() {
                    return size;
                }
            }
        }
    }

    public static class MetaEntity {
        /**
         * status : 200
         * msg : OK
         */
        @SerializedName("status")
        private int status;
        @SerializedName("msg")
        private String msg;

        public void setStatus(int status) {
            this.status = status;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getStatus() {
            return status;
        }

        public String getMsg() {
            return msg;
        }
    }
}
