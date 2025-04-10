#version 150

uniform sampler2D DiffuseSampler;
uniform float Time;

in vec2 texCoord;

out vec4 fragColor;

void main() {
    vec2 uv = texCoord;
    
    float strength = 0.01;
    float freq = 2;
    float animSpeed = 6.1;
    float smoothTime = mod(Time * animSpeed, 19);
    vec2 distortion = vec2(
        sin(uv.y * freq + smoothTime),
        sin(uv.x * freq + smoothTime)
    ) * strength;
    
    vec2 distortedUV = uv + distortion;
    distortedUV = clamp(distortedUV, 0.0, 1.0);
    
    vec4 color = texture(DiffuseSampler, distortedUV);
    fragColor = vec4(color.rgb, 1.0);
}