package com.vishal.project.uber.uberApp.configs;

import com.vishal.project.uber.uberApp.dto.PointDto;
import com.vishal.project.uber.uberApp.utils.GeometryUtil;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;

@Configuration
public class MapperConfig {
    @Bean
    public ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.typeMap(PointDto.class, Point.class).setConverter(mappingContext -> {
           PointDto pointDto = mappingContext.getSource();
           return GeometryUtil.createPoint(pointDto);
        });

        modelMapper.typeMap(Point.class, PointDto.class).setConverter( mappingContext -> {
            Point point = mappingContext.getSource();
            double coordinates[] = {
                    point.getX(),
                    point.getY()
            };

            return new PointDto();
        });
        return modelMapper;
    }
}
