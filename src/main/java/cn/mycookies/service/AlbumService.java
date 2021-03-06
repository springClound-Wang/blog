package cn.mycookies.service;

import cn.mycookies.common.base.ServerResponse;
import cn.mycookies.dao.AlbumDOMapper;
import cn.mycookies.dao.PhotoDOMapper;
import cn.mycookies.pojo.dto.PhotoDTO;
import cn.mycookies.pojo.dto.SimpleAlbumDTO;
import cn.mycookies.pojo.dto.TagVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 相册管理相关service
 *
 * @author Jann Lee
 * @date 2018-11-29
 */
public class AlbumService {

    @Autowired
    AlbumDOMapper albumDOMapper;

    @Autowired
    PhotoDOMapper photoDOMapper;

    public ServerResponse<List<SimpleAlbumDTO>> listSimpleAlbums(int type, int limit) {

        return null;
    }

    public ServerResponse<List<PhotoDTO>> listAllPhotos(int albumId) {
        return null;
    }

    public ServerResponse<TagVO> countAlbumNumber() {
        return null;
    }
}
