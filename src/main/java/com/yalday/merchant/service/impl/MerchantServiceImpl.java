package com.yalday.merchant.service.impl;

import com.yalday.merchant.service.MerchantService;
import com.yalday.merchant.domain.Merchant;
import com.yalday.merchant.repository.MerchantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

/**
 * Service Implementation for managing Merchant.
 */
@Service
public class MerchantServiceImpl implements MerchantService{

    private final Logger log = LoggerFactory.getLogger(MerchantServiceImpl.class);
    
    @Inject
    private MerchantRepository merchantRepository;

    /**
     * Save a merchant.
     *
     * @param merchant the entity to save
     * @return the persisted entity
     */
    public Merchant save(Merchant merchant) {
        log.debug("Request to save Merchant : {}", merchant);
        Merchant result = merchantRepository.save(merchant);
        return result;
    }

    /**
     *  Get all the merchants.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    public Page<Merchant> findAll(Pageable pageable) {
        log.debug("Request to get all Merchants");
        Page<Merchant> result = merchantRepository.findAll(pageable);
        return result;
    }

    /**
     *  Get one merchant by id.
     *
     *  @param id the id of the entity
     *  @return the entity
     */
    public Merchant findOne(String id) {
        log.debug("Request to get Merchant : {}", id);
        Merchant merchant = merchantRepository.findOne(id);
        return merchant;
    }

    /**
     *  Delete the  merchant by id.
     *
     *  @param id the id of the entity
     */
    public void delete(String id) {
        log.debug("Request to delete Merchant : {}", id);
        merchantRepository.delete(id);
    }
}
