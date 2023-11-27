package ru.sendel.pastebox.api.response;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import ru.sendel.pastebox.api.request.PublicStatus;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class PasteboxResponse {
    private final String data;
    private final boolean isPublic;
}
