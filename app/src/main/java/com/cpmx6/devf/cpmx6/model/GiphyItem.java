package com.cpmx6.devf.cpmx6.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hugo on 7/19/15.
 */
public class GiphyItem implements Serializable {

    /**
     * data : [{"caption":"","trending_datetime":"2014-11-12 06:22:52","type":"gif","url":"http://giphy.com/gifs/eyes-shocked-bird-feqkVgjJpYtjy","content_url":"","id":"feqkVgjJpYtjy","import_datetime":"2013-03-21 04:03:08","username":"","source":"http://littleanimalgifs.tumblr.com/post/17994517807","embed_url":"http://giphy.com/embed/feqkVgjJpYtjy","images":{"fixed_height":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.webp","height":"200","mp4_size":"27279","width":"445","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200.gif","webp_size":"420734","size":"445432"},"fixed_height_small_still":{"height":"100","width":"223","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100_s.gif"},"original_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_small_still":{"height":"45","width":"100","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w_s.gif"},"fixed_width_still":{"height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_s.gif"},"downsized_still":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy_s.gif"},"fixed_width_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.webp","height":"90","width":"200","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w_d.gif","webp_size":"26460","size":"83007"},"fixed_height_downsampled":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.webp","height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_d.gif","webp_size":"89516","size":"183225"},"fixed_width":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.webp","height":"90","mp4_size":"31919","width":"200","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200w.gif","webp_size":"122600","size":"115885"},"fixed_height_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.webp","height":"100","mp4_size":"240476","width":"223","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100.gif","webp_size":"129604","size":"445432"},"original":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.webp","height":"150","mp4_size":"97841","frames":"27","width":"334","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","webp_size":"270108","size":"511581"},"fixed_height_still":{"height":"200","width":"445","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/200_s.gif"},"downsized":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"downsized_large":{"height":"150","width":"334","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/giphy.gif","size":"511581"},"fixed_width_small":{"webp":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.webp","height":"45","mp4_size":"79783","width":"100","mp4":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.mp4","url":"http://media0.giphy.com/media/feqkVgjJpYtjy/100w.gif","webp_size":"41620","size":"115885"}},"bitly_gif_url":"http://gph.is/XJ200y","bitly_url":"http://gph.is/XJ200y","rating":"g"},{"caption":"","trending_datetime":"1970-01-01 00:00:00","type":"gif","url":"http://giphy.com/gifs/mrdiv-art-mrdiv-disco-ball-7rzbxdu0ZEXLy","content_url":"","id":"7rzbxdu0ZEXLy","import_datetime":"2013-06-18 11:30:02","username":"mrdiv","source":"http://mrdiv.tumblr.com/post/48618427039/disco-sphere","embed_url":"http://giphy.com/embed/7rzbxdu0ZEXLy","images":{"fixed_height":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200.webp","height":"200","mp4_size":"17167","width":"200","mp4":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200.mp4","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200.gif","webp_size":"71556","size":"95494"},"fixed_height_small_still":{"height":"100","width":"100","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100_s.gif"},"original_still":{"height":"500","width":"500","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy_s.gif"},"fixed_width_small_still":{"height":"100","width":"100","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100w_s.gif"},"fixed_width_still":{"height":"200","width":"200","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w_s.gif"},"downsized_still":{"height":"500","width":"500","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy_s.gif"},"fixed_width_downsampled":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w_d.webp","height":"200","width":"200","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w_d.gif","webp_size":"48112","size":"188423"},"fixed_height_downsampled":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200_d.webp","height":"200","width":"200","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200_d.gif","webp_size":"48112","size":"188423"},"fixed_width":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w.webp","height":"200","mp4_size":"17167","width":"200","mp4":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w.mp4","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200w.gif","webp_size":"71556","size":"95494"},"fixed_height_small":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100.webp","height":"100","mp4_size":"22745","width":"100","mp4":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100.mp4","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100.gif","webp_size":"25250","size":"95494"},"original":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy.webp","height":"500","mp4_size":"52678","frames":"9","width":"500","mp4":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy.mp4","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy.gif","webp_size":"262666","size":"1012692"},"fixed_height_still":{"height":"200","width":"200","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/200_s.gif"},"downsized":{"height":"500","width":"500","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy.gif","size":"1012692"},"downsized_large":{"height":"500","width":"500","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/giphy.gif","size":"1012692"},"fixed_width_small":{"webp":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100w.webp","height":"100","mp4_size":"22745","width":"100","mp4":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100w.mp4","url":"http://media4.giphy.com/media/7rzbxdu0ZEXLy/100w.gif","webp_size":"25250","size":"95494"}},"bitly_gif_url":"http://gph.is/13YkU2y","bitly_url":"http://gph.is/13YkU2y","rating":"g"}]
     * pagination : {"count":2,"offset":0,"total_count":2}
     * meta : {"status":200,"msg":"OK"}
     */
    @SerializedName("data")
    private List<DataEntity> data;
    @SerializedName("pagination")
    private PaginationEntity pagination;
    @SerializedName("meta")
    private MetaEntity meta;

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public void setPagination(PaginationEntity pagination) {
        this.pagination = pagination;
    }

    public void setMeta(MetaEntity meta) {
        this.meta = meta;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public PaginationEntity getPagination() {
        return pagination;
    }

    public MetaEntity getMeta() {
        return meta;
    }

    public class DataEntity {
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
        @SerializedName("trending_datetime")
        private String trending_datetime;
        @SerializedName("type")
        private String type;
        @SerializedName("url")
        private String url;
        @SerializedName("content_url")
        private String content_url;
        @SerializedName("id")
        private String id;
        @SerializedName("import_datetime")
        private String import_datetime;
        @SerializedName("username")
        private String username;
        @SerializedName("source")
        private String source;
        @SerializedName("embed_url")
        private String embed_url;
        @SerializedName("images")
        private ImagesEntity images;
        @SerializedName("bitly_gif_url")
        private String bitly_gif_url;
        @SerializedName("bitly_url")
        private String bitly_url;
        @SerializedName("rating")
        private String rating;

        public void setCaption(String caption) {
            this.caption = caption;
        }

        public void setTrending_datetime(String trending_datetime) {
            this.trending_datetime = trending_datetime;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public void setContent_url(String content_url) {
            this.content_url = content_url;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setImport_datetime(String import_datetime) {
            this.import_datetime = import_datetime;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public void setEmbed_url(String embed_url) {
            this.embed_url = embed_url;
        }

        public void setImages(ImagesEntity images) {
            this.images = images;
        }

        public void setBitly_gif_url(String bitly_gif_url) {
            this.bitly_gif_url = bitly_gif_url;
        }

        public void setBitly_url(String bitly_url) {
            this.bitly_url = bitly_url;
        }

        public void setRating(String rating) {
            this.rating = rating;
        }

        public String getCaption() {
            return caption;
        }

        public String getTrending_datetime() {
            return trending_datetime;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public String getContent_url() {
            return content_url;
        }

        public String getId() {
            return id;
        }

        public String getImport_datetime() {
            return import_datetime;
        }

        public String getUsername() {
            return username;
        }

        public String getSource() {
            return source;
        }

        public String getEmbed_url() {
            return embed_url;
        }

        public ImagesEntity getImages() {
            return images;
        }

        public String getBitly_gif_url() {
            return bitly_gif_url;
        }

        public String getBitly_url() {
            return bitly_url;
        }

        public String getRating() {
            return rating;
        }

        public class ImagesEntity {
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
            @SerializedName("fixed_height")
            private Fixed_heightEntity fixed_height;
            @SerializedName("fixed_height_small_still")
            private Fixed_height_small_stillEntity fixed_height_small_still;
            @SerializedName("original_still")
            private Original_stillEntity original_still;
            @SerializedName("fixed_width_small_still")
            private Fixed_width_small_stillEntity fixed_width_small_still;
            @SerializedName("fixed_width_still")
            private Fixed_width_stillEntity fixed_width_still;
            @SerializedName("downsized_still")
            private Downsized_stillEntity downsized_still;
            @SerializedName("fixed_width_downsampled")
            private Fixed_width_downsampledEntity fixed_width_downsampled;
            @SerializedName("fixed_height_downsampled")
            private Fixed_height_downsampledEntity fixed_height_downsampled;
            @SerializedName("fixed_width")
            private Fixed_widthEntity fixed_width;
            @SerializedName("fixed_height_small")
            private Fixed_height_smallEntity fixed_height_small;
            @SerializedName("original")
            private OriginalEntity original;
            @SerializedName("fixed_height_still")
            private Fixed_height_stillEntity fixed_height_still;
            @SerializedName("downsized")
            private DownsizedEntity downsized;
            @SerializedName("downsized_large")
            private Downsized_largeEntity downsized_large;
            @SerializedName("fixed_width_small")
            private Fixed_width_smallEntity fixed_width_small;

            public void setFixed_height(Fixed_heightEntity fixed_height) {
                this.fixed_height = fixed_height;
            }

            public void setFixed_height_small_still(Fixed_height_small_stillEntity fixed_height_small_still) {
                this.fixed_height_small_still = fixed_height_small_still;
            }

            public void setOriginal_still(Original_stillEntity original_still) {
                this.original_still = original_still;
            }

            public void setFixed_width_small_still(Fixed_width_small_stillEntity fixed_width_small_still) {
                this.fixed_width_small_still = fixed_width_small_still;
            }

            public void setFixed_width_still(Fixed_width_stillEntity fixed_width_still) {
                this.fixed_width_still = fixed_width_still;
            }

            public void setDownsized_still(Downsized_stillEntity downsized_still) {
                this.downsized_still = downsized_still;
            }

            public void setFixed_width_downsampled(Fixed_width_downsampledEntity fixed_width_downsampled) {
                this.fixed_width_downsampled = fixed_width_downsampled;
            }

            public void setFixed_height_downsampled(Fixed_height_downsampledEntity fixed_height_downsampled) {
                this.fixed_height_downsampled = fixed_height_downsampled;
            }

            public void setFixed_width(Fixed_widthEntity fixed_width) {
                this.fixed_width = fixed_width;
            }

            public void setFixed_height_small(Fixed_height_smallEntity fixed_height_small) {
                this.fixed_height_small = fixed_height_small;
            }

            public void setOriginal(OriginalEntity original) {
                this.original = original;
            }

            public void setFixed_height_still(Fixed_height_stillEntity fixed_height_still) {
                this.fixed_height_still = fixed_height_still;
            }

            public void setDownsized(DownsizedEntity downsized) {
                this.downsized = downsized;
            }

            public void setDownsized_large(Downsized_largeEntity downsized_large) {
                this.downsized_large = downsized_large;
            }

            public void setFixed_width_small(Fixed_width_smallEntity fixed_width_small) {
                this.fixed_width_small = fixed_width_small;
            }

            public Fixed_heightEntity getFixed_height() {
                return fixed_height;
            }

            public Fixed_height_small_stillEntity getFixed_height_small_still() {
                return fixed_height_small_still;
            }

            public Original_stillEntity getOriginal_still() {
                return original_still;
            }

            public Fixed_width_small_stillEntity getFixed_width_small_still() {
                return fixed_width_small_still;
            }

            public Fixed_width_stillEntity getFixed_width_still() {
                return fixed_width_still;
            }

            public Downsized_stillEntity getDownsized_still() {
                return downsized_still;
            }

            public Fixed_width_downsampledEntity getFixed_width_downsampled() {
                return fixed_width_downsampled;
            }

            public Fixed_height_downsampledEntity getFixed_height_downsampled() {
                return fixed_height_downsampled;
            }

            public Fixed_widthEntity getFixed_width() {
                return fixed_width;
            }

            public Fixed_height_smallEntity getFixed_height_small() {
                return fixed_height_small;
            }

            public OriginalEntity getOriginal() {
                return original;
            }

            public Fixed_height_stillEntity getFixed_height_still() {
                return fixed_height_still;
            }

            public DownsizedEntity getDownsized() {
                return downsized;
            }

            public Downsized_largeEntity getDownsized_large() {
                return downsized_large;
            }

            public Fixed_width_smallEntity getFixed_width_small() {
                return fixed_width_small;
            }

            public class Fixed_heightEntity {
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
                @SerializedName("mp4_size")
                private String mp4_size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webp_size")
                private String webp_size;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getMp4_size() {
                    return mp4_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class Fixed_height_small_stillEntity {
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

            public class Original_stillEntity {
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

            public class Fixed_width_small_stillEntity {
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

            public class Fixed_width_stillEntity {
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

            public class Downsized_stillEntity {
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

            public class Fixed_width_downsampledEntity {
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
                @SerializedName("webp_size")
                private String webp_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class Fixed_height_downsampledEntity {
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
                @SerializedName("webp_size")
                private String webp_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class Fixed_widthEntity {
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
                @SerializedName("mp4_size")
                private String mp4_size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webp_size")
                private String webp_size;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getMp4_size() {
                    return mp4_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class Fixed_height_smallEntity {
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
                @SerializedName("mp4_size")
                private String mp4_size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webp_size")
                private String webp_size;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getMp4_size() {
                    return mp4_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class OriginalEntity {
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
                @SerializedName("mp4_size")
                private String mp4_size;
                @SerializedName("frames")
                private String frames;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webp_size")
                private String webp_size;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getMp4_size() {
                    return mp4_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }

            public class Fixed_height_stillEntity {
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

            public class DownsizedEntity {
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

            public class Downsized_largeEntity {
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

            public class Fixed_width_smallEntity {
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
                @SerializedName("mp4_size")
                private String mp4_size;
                @SerializedName("width")
                private String width;
                @SerializedName("mp4")
                private String mp4;
                @SerializedName("url")
                private String url;
                @SerializedName("webp_size")
                private String webp_size;
                @SerializedName("size")
                private String size;

                public void setWebp(String webp) {
                    this.webp = webp;
                }

                public void setHeight(String height) {
                    this.height = height;
                }

                public void setMp4_size(String mp4_size) {
                    this.mp4_size = mp4_size;
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

                public void setWebp_size(String webp_size) {
                    this.webp_size = webp_size;
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

                public String getMp4_size() {
                    return mp4_size;
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

                public String getWebp_size() {
                    return webp_size;
                }

                public String getSize() {
                    return size;
                }
            }
        }
    }

    public class PaginationEntity {
        /**
         * count : 2
         * offset : 0
         * total_count : 2
         */
        @SerializedName("count")
        private int count;
        @SerializedName("offset")
        private int offset;
        @SerializedName("total_count")
        private int total_count;

        public void setCount(int count) {
            this.count = count;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public void setTotal_count(int total_count) {
            this.total_count = total_count;
        }

        public int getCount() {
            return count;
        }

        public int getOffset() {
            return offset;
        }

        public int getTotal_count() {
            return total_count;
        }
    }

    public class MetaEntity {
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
