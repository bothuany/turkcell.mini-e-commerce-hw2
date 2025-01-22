package com.turkcell.mini_e_commere_hw2.service.application;

import com.turkcell.mini_e_commere_hw2.dto.cart.AddToCartDto;
import com.turkcell.mini_e_commere_hw2.dto.cart.CartListingDto;
import com.turkcell.mini_e_commere_hw2.dto.cart.RemoveFromCartDto;
import com.turkcell.mini_e_commere_hw2.service.domain.CartService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CartApplicationServiceImpl implements CartApplicationService {
    private final CartService cartService;
    private final ModelMapper modelMapper;

    @Override
    public CartListingDto getById(Integer id) {
        return modelMapper.map(cartService.getById(id), CartListingDto.class);
    }

    @Override
    public List<CartListingDto> getAll() {
        return cartService.getAll().stream()
                .map(cart -> modelMapper.map(cart, CartListingDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void addCartItemToCart(Integer cartId, AddToCartDto addToCartDto) {
        cartService.addCartItemToCart(cartId, addToCartDto.getProductId(), addToCartDto.getQuantity());
    }

    @Override
    public void removeCartItemFromCart(Integer cartId, RemoveFromCartDto removeFromCartDto) {
        cartService.removeCartItemFromCart(cartId, removeFromCartDto.getCartItemId(), removeFromCartDto.getQuantity());
    }

    @Override
    public void resetCart(Integer cartId) {
        cartService.resetCart(cartId);
    }
}