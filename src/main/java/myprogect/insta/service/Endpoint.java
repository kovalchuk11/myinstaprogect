package myprogect.insta.service;

public class Endpoint {
    public static final String BASE_URL = "https://www.instagram.com";
    public static final String LOGIN_URL = "https://www.instagram.com/accounts/login/ajax/";
    public static final String ACCOUNT_PAGE = "https://www.instagram.com/{{username}}";
    public static final String MEDIA_LINK = "https://www.instagram.com/p/{{code}}";
    public static final String ACCOUNT_MEDIAS = "https://www.instagram.com/{{username}}/?__a=1&max_id={{maxId}}";
    public static final String ACCOUNT_JSON_INFO = "https://www.instagram.com/{{username}}/?__a=1";
    public static final String TAG_JSON_INFO = "https://www.instagram.com/explore/tags/{{tag_name}}/?__a=1";
    public static final String MEDIA_JSON_INFO = "https://www.instagram.com/p/{{code}}/?__a=1";
    public static final String MEDIA_JSON_BY_LOCATION_ID = "https://www.instagram.com/explore/locations/{{facebookLocationId}}/?__a=1&max_id={{maxId}}";
    public static final String MEDIA_JSON_BY_TAG = "https://www.instagram.com/explore/tags/{{tag}}/?__a=1&max_id={{maxId}}";
    public static final String GENERAL_SEARCH = "https://www.instagram.com/web/search/topsearch/?query={{query}}";
    public static final String ACCOUNT_JSON_INFO_BY_ID = "https://www.instagram.com/graphql/query/?query_id=17880160963012870&id={{userId}}&first=1";
    public static final String LAST_COMMENTS_BY_CODE = "ig_shortcode({{code}}){comments.last({{count}}){count,nodes{id,created_at,text,user{id,profile_pic_url,username,follows{count},followed_by{count},biography,full_name,media{count},is_private,external_url,is_verified}},page_info}}";
    public static final String COMMENTS_BEFORE_COMMENT_ID_BY_CODE = "https://www.instagram.com/graphql/query/?query_id=17852405266163336&shortcode={{shortcode}}&first={{count}}&after={{commentId}}";
    public static final String MEDIA_LIKE = "https://www.instagram.com/web/likes/{{mediaId}}/like/";
    public static final String MEDIA_UNLIKE = "https://www.instagram.com/web/likes/{{mediaId}}/unlike/";
    public static final String MEDIA_COMMENTS_ADD = "https://www.instagram.com/web/comments/{{mediaId}}/add/";
    public static final String MEDIA_COMMENTS_DELETE = "https://www.instagram.com/web/comments/{{mediaId}}/delete/{{commentId}}/";
    public static final String FOLLOWS_URL = "https://www.instagram.com/graphql/query/?query_id=17874545323001329&variables={\"id\": {{userId}}, \"first\": {{count}}, \"after\": \"{{endCursor}}\"}";
    public static final String FOLLOWERS_URL = "https://www.instagram.com/graphql/query/?query_id=17851374694183129&variables={\"id\": {{userId}}, \"first\": {{count}}, \"after\": \"{{endCursor}}\"}";

    public static String getBaseUrl() {
        return BASE_URL;
    }

    public static String getLoginUrl() {
        return LOGIN_URL;
    }

    public static String getAccountPage() {
        return ACCOUNT_PAGE;
    }

    public static String getMediaLink() {
        return MEDIA_LINK;
    }

    public static String getAccountMedias(String username, String maxId) {
        if (maxId == null) {
            maxId = "";
        }
        return ACCOUNT_MEDIAS.replace("{{username}}", username).replace("{{maxId}}", maxId);
    }

    public static String getAccountJsonInfo(String username) {
        return ACCOUNT_JSON_INFO.replace("{{username}}", username);
    }

    public static String getTagJsonInfo() {
        return TAG_JSON_INFO;
    }

    public static String getMediaJsonInfo(String code) {
        return MEDIA_JSON_INFO.replace("{{code}}", code);
    }

    public static String getMediaJsonByLocationId() {
        return MEDIA_JSON_BY_LOCATION_ID;
    }

    public static String getMediaJsonByTag() {
        return MEDIA_JSON_BY_TAG;
    }

    public static String getGeneralSearch() {
        return GENERAL_SEARCH;
    }

    public static String getAccountJsonInfoById() {
        return ACCOUNT_JSON_INFO_BY_ID;
    }

    public static String getLastCommentsByCode() {
        return LAST_COMMENTS_BY_CODE;
    }

    public static String getCommentsBeforeCommentIdByCode() {
        return COMMENTS_BEFORE_COMMENT_ID_BY_CODE;
    }

    public static String getMediaLike() {
        return MEDIA_LIKE;
    }

    public static String getMediaUnlike() {
        return MEDIA_UNLIKE;
    }

    public static String getMediaCommentsAdd() {
        return MEDIA_COMMENTS_ADD;
    }

    public static String getMediaCommentsDelete() {
        return MEDIA_COMMENTS_DELETE;
    }

    public static String getFollowsUrl() {
        return FOLLOWS_URL;
    }

    public static String getFollowersUrl() {
        return FOLLOWERS_URL;
    }

    public static String getInstagramQueryUrl() {
        return INSTAGRAM_QUERY_URL;
    }

    public static String getInstagramCdnUrl() {
        return INSTAGRAM_CDN_URL;
    }

    public static final String INSTAGRAM_QUERY_URL = "https://www.instagram.com/query/";
    public static final String INSTAGRAM_CDN_URL = "https://scontent.cdninstagram.com/";
}
