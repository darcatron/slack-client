package com.hubspot.slack.client.methods.params.chat;

import org.immutables.value.Value.Default;
import org.immutables.value.Value.Immutable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hubspot.immutables.styles.HubSpotStyle;

@Immutable
@HubSpotStyle
public interface ChatPostEphemeralMessageParamsIF extends MessageParams {
  @JsonProperty("user")
  String getUserToSendTo();

  @Default
  @JsonProperty("as_user")
  default boolean getSendAsUser() {
    return false;
  }

  @Default
  @JsonProperty("link_names")
  default boolean getShouldLinkNames() {
    return true;
  }

  @Default
  @JsonProperty("parse")
  default String getParseMode() {
    return "full";
  }
}
