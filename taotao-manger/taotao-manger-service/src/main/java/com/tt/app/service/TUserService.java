package com.tt.app.service;

import com.tt.app.model.TUser;
import com.tt.app.model.TUserExample;
import com.tt.common.core.GenericService;

 /**
 * Generate By MBG 
 **/
public interface TUserService extends GenericService<TUser, TUserExample, String> {
     /**
     * According to the model information query object  
     * @param BaseTUser
     * @return 
     **/
    TUser queryByModel(TUser tUser);
}